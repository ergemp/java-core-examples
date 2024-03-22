package org.ergemp.networkingExamples.nicExamples;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class RetrieveNetworkInterfaces {
    public static void main(String[] args) throws SocketException {

        // ref: https://docs.oracle.com/javase/tutorial/networking/nifs/index.html

        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();

        for (NetworkInterface netIf : Collections.list(nets)) {
            System.out.printf("Display name: %s\n", netIf.getDisplayName());
            System.out.printf("Name: %s\n", netIf.getName());

            Enumeration<InetAddress> inetAddresses = netIf.getInetAddresses();
            for (InetAddress inetAddress : Collections.list(inetAddresses)) {
                System.out.printf("InetAddress: %s\n", inetAddress);
            }

            System.out.printf("Up? %s\n", netIf.isUp());
            System.out.printf("Loopback? %s\n", netIf.isLoopback());
            System.out.printf("PointToPoint? %s\n", netIf.isPointToPoint());
            System.out.printf("Supports multicast? %s\n", netIf.supportsMulticast());
            System.out.printf("Virtual? %s\n", netIf.isVirtual());
            System.out.printf("Hardware address: %s\n", Arrays.toString(netIf.getHardwareAddress()));
            System.out.printf("MTU: %s\n", netIf.getMTU());
            System.out.printf("\n");

            displaySubInterfaces(netIf);
            System.out.printf("\n");
        }

    }

    static void displaySubInterfaces(NetworkInterface netIf) throws SocketException {
        Enumeration<NetworkInterface> subIfs = netIf.getSubInterfaces();

        for (NetworkInterface subIf : Collections.list(subIfs)) {
            System.out.printf("\tSub Interface Display name: %s\n", subIf.getDisplayName());
            System.out.printf("\tSub Interface Name: %s\n", subIf.getName());
        }
    }
}
