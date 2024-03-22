package org.ergemp.networkingExamples;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/URLConnection-class
        // The Java URLConnection class represents a communication link between the URL and the application.
        // It can be used to read and write data to the specified resource referred by the URL.

        try {
            URL url = new URL("https://www.javatpoint.com/java-tutorial");

            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());

            //url = new URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");

            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("Default Port Number: "+url.getDefaultPort());
            System.out.println("Query String: "+url.getQuery());
            System.out.println("Path: "+url.getPath());
            System.out.println("File: "+url.getFile());

            System.out.println("URL is " + url.toString());
            System.out.println("protocol is " + url.getProtocol());
            System.out.println("authority is " + url.getAuthority());
            System.out.println("file name is " + url.getFile());
            System.out.println("host is " + url.getHost());
            System.out.println("path is " + url.getPath());
            System.out.println("port is " + url.getPort());
            System.out.println("default port is " + url.getDefaultPort());
            System.out.println("query is " + url.getQuery());
            System.out.println("ref is " + url.getRef());

            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();

            int i;
            while( (i = stream.read()) != -1){
                 // System.out.print((char)i);
            }

            //
            // ref: https://www.tutorialspoint.com/java/java_url_processing.htm
            // reading url with bufferedreader
            //

            URL url2 = new URL("https://www.tutorialspoint.com");
            URLConnection urlConnection = url2.openConnection();

            HttpURLConnection connection = null;
            if (urlConnection instanceof HttpURLConnection) {
                connection = (HttpURLConnection) urlConnection;
            } else {
                System.out.println("Please enter an HTTP URL.");
                return;
            }

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String urlString = "";
            String current;

            while((current = in.readLine()) != null) {
                urlString += current;
            }
            System.out.println(urlString);

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
