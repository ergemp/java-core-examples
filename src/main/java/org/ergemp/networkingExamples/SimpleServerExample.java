package org.ergemp.networkingExamples;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServerExample {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);

        //establishes connection and waits for the client
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());

        String str = dis.readUTF();

        System.out.println("message = " + str);

        ss.close();

    }
}
