package org.ergemp.networkingExamples;

import java.io.*;
import java.net.Socket;

public class SocketThreadedClientExample {
    public static void main(String[] args) {

        // ref: https://www.tutorialspoint.com/java/java_networking.htm

        //String serverName = args[0];
        String serverName = "localhost";

        //int port = Integer.parseInt(args[1]);
        int port = 6666;

        try {

            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Server says " + in.readUTF());
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
