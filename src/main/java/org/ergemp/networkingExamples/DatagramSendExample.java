package org.ergemp.networkingExamples;

import java.io.IOException;
import java.net.*;

public class DatagramSendExample {
    public static void main(String[] args) throws IOException {

        // ref: https://www.javatpoint.com/DatagramSocket-and-DatagramPacket
        // Java DatagramSocket and DatagramPacket classes are used for connection-less socket programming
        // using the UDP instead of TCP.


        DatagramSocket ds = new DatagramSocket();
        String str = "Welcome java";
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);

        ds.send(dp);
        ds.close();

    }
}
