package org.ergemp.networkingExamples;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramReceiveExample {
    public static void main(String[] args) throws IOException {

        // ref: https://www.javatpoint.com/DatagramSocket-and-DatagramPacket
        // Java DatagramSocket and DatagramPacket classes are used for connection-less socket programming
        // using the UDP instead of TCP.


        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];

        DatagramPacket dp = new DatagramPacket(buf, 1024);

        ds.receive(dp);

        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(str);

        ds.close();

    }
}
