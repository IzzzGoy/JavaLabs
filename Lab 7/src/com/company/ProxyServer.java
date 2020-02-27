package com.company;

import java.io.*;
import java.net.*;

public class ProxyServer implements Runnable {

    private static ServerSocket ss;

    static {
        try {
            ss = new ServerSocket(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Socket s;
    private InputStream is;
    private OutputStream os;

    public ProxyServer() {
        try {
            this.s = ss.accept();
            this.is = s.getInputStream();
            this.os = s.getOutputStream();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            //readInputHeaders();
            System.out.println("we are here 1");
            writeResponse("<html><body><h1>Kill me, please!</h1></body></html>");
        } catch (Throwable t) {
            /*do nothing*/
        } finally {
            try {
                s.close();
            } catch (Throwable t) {
                /*do nothing*/
            }
        }
        //System.err.println("Client processing finished");
    }

    private void writeResponse(String s) throws Throwable {
        String response = "HTTP/1.0 200 OK\r\n" +
                "Server: YarServer/2009-09-09\r\n" +
                "Content-Type: text/html\r\n" +
                "Content-Length: " + s.length() + "\r\n" +
                "Connection: close\r\n\r\n";
        String result = response + s;
        os.write(result.getBytes());
        os.flush();
    }

    private void readInputHeaders() throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while(true) {
            String s = br.readLine();
            System.out.println(s);
            if(s == null || s.trim().length() == 0) {
                System.out.println(s);
                break;
            }
        }
    }
}
