package org.ergemp.apacheHTTPRequestExamples;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ApacheHTTPGetExample {
    public static void main(String[] args) throws Exception {

        CloseableHttpClient client = HttpClients.createDefault();

        HttpGet request = new HttpGet("https://webhook.site/ec7ac50d-7ec1-4ff8-8474-110bbb989de3?");
        CloseableHttpResponse response = client.execute(request);

        try {
            // Get the response
            BufferedReader rd = new BufferedReader
                    (new InputStreamReader(
                            response.getEntity().getContent()));

            String line = "";
            while ((line = rd.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
            response.close();
        }
    }
}
