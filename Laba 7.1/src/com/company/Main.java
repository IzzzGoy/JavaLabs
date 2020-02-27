package com.company;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            //ServerSocket ss = new ServerSocket(19090);
            //Socket s = ss.accept();
            System.err.println("Client accepted");
            new Thread(new Client( new InetSocketAddress(args[0], Integer.parseInt(args[1])))).start();
        }
    }
}
