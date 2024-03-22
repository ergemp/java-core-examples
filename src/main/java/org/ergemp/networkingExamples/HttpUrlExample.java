package org.ergemp.networkingExamples;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrlExample {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/java-http-url-connection
        // The Java HttpURLConnection class is http specific URLConnection. It works for HTTP protocol only.

        try {

            URL url=new URL("https://www.javatpoint.com/java-tutorial");
            HttpURLConnection huc=(HttpURLConnection)url.openConnection();

            for(int i=1;i<=10;i++){
                System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
            }
            huc.disconnect();
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
}
