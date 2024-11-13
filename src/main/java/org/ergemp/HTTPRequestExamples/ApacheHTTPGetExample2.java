package org.ergemp.HTTPRequestExamples;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class ApacheHTTPGetExample2 {
    public static void main(String[] args) throws Exception {

        CloseableHttpClient client = HttpClients.createDefault();

        HttpGet request = new HttpGet("https://webhook.site/ec7ac50d-7ec1-4ff8-8474-110bbb989de3?");
        CloseableHttpResponse response = client.execute(request);

        try {
            System.out.println("response.getProtocolVersion: " + response.getProtocolVersion());
            System.out.println("response.getStatusLine.getStatusCode: " + response.getStatusLine().getStatusCode());
            System.out.println("response.getStatusLine.getReasonPhrase: " + response.getStatusLine().getReasonPhrase());
            System.out.println("response.getStatusLine: " + response.getStatusLine());
            System.out.println("response.getAllHeaders: " + response.getAllHeaders().toString());
            System.out.println("response.getEntity: " + EntityUtils.toString(response.getEntity()));

            HttpEntity entity = response.getEntity();

            // do something useful with the response body
            // and ensure it is fully consumed
            EntityUtils.consume(entity);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
            response.close();
        }
    }
}
