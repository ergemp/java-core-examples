package org.ergemp.networkingExamples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class SocketThreadedServerExample extends Thread{

    // ref: https://www.tutorialspoint.com/java/java_networking.htm
    private ServerSocket serverSocket;

    public static void main(String[] args) {

        //int port = Integer.parseInt(args[0]);
        int port = 6666;

        try {
            Thread t = new SocketThreadedServerExample(port);
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public SocketThreadedServerExample(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public void run() {
        while(true) {
            try {
                System.out.println("Waiting for client on port " +
                        serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();

                System.out.println("Just connected to " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());

                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
                        + "\nGoodbye!");
                server.close();

            } catch (SocketTimeoutException s) {
                System.out.println("Socket timed out!");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }

}
