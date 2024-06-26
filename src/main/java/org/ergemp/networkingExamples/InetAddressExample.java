package org.ergemp.networkingExamples;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressExample {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/InetAddress-class
        // Java InetAddress class represents an IP address.
        // The java.net.InetAddress class provides methods to get the IP of any host name
        // for example www.javatpoint.com, www.google.com, www.facebook.com, etc.

        try {
            InetAddress ip=InetAddress.getByName("www.javatpoint.com");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());


            ip =  Inet4Address.getByName("www.javatpoint.com");
            InetAddress ip1[] = InetAddress.getAllByName("www.javatpoint.com");
            byte addr[]={72, 3, 2, 12};
            System.out.println("ip : "+ip);
            System.out.print("\nip1 : "+ip1);
            InetAddress ip2 =  InetAddress.getByAddress(addr);
            System.out.print("\nip2 : "+ip2);
            System.out.print("\nAddress : " + Arrays.toString(ip.getAddress()));
            System.out.print("\nHost Address : " +ip.getHostAddress());
            System.out.print("\nisAnyLocalAddress : " +ip.isAnyLocalAddress());
            System.out.print("\nisLinkLocalAddress : " +ip.isLinkLocalAddress());
            System.out.print("\nisLoopbackAddress : " +ip.isLoopbackAddress());
            System.out.print("\nisMCGlobal : " +ip.isMCGlobal());
            System.out.print("\nisMCLinkLocal : " +ip.isMCLinkLocal());
            System.out.print("\nisMCNodeLocal : " +ip.isMCNodeLocal());
            System.out.print("\nisMCOrgLocal : " +ip.isMCOrgLocal());
            System.out.print("\nisMCSiteLocal : " +ip.isMCSiteLocal());
            System.out.print("\nisMulticastAddress : " +ip.isMulticastAddress());
            System.out.print("\nisSiteLocalAddress : " +ip.isSiteLocalAddress());
            System.out.print("\nhashCode : " +ip.hashCode());
            System.out.print("\n Is ip1 == ip2 : " +ip.equals(ip2));



        }
        catch(Exception e) {
            System.out.println(e);
        }






    }
}
