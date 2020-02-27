package com.company;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Client implements Runnable {

    private OutputStream ctobr;  //ClientTOBrowser
    private InputStream brtoc;   //BrowserTOClient
    private OutputStream ctos;   //ClientTOServer
    private InputStream stoc;    //ServerTOClient
    private Socket serverSocket;
    private Socket clientSocket;

    private static ServerSocket ss;

    static {
        try {
            ss = new ServerSocket(19090);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Client( InetSocketAddress ia) throws IOException {
        serverSocket    =   ss.accept();
        ctobr           =   serverSocket.getOutputStream();
        brtoc           =   serverSocket.getInputStream();

        clientSocket = new Socket();
        clientSocket.connect(ia, 2000);

        ctos    =   clientSocket.getOutputStream();
        stoc    =   clientSocket.getInputStream();
    }

    @Override
    public void run() {
        try {
            readInputHeaders();
            ctos.write("hello from client".getBytes());
            ctos.flush();
            byte[] mess = stoc.readAllBytes();
            System.out.println("we are here!");
            ctobr.write(mess);
            ctobr.flush();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            try {
                serverSocket.close();
                clientSocket.close();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    private void readInputHeaders() throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(brtoc));
        while(true) {
            String s = br.readLine();
            //System.out.println(s);
            if(s == null || s.trim().length() == 0) {
                break;
            }
        }
    }
}
