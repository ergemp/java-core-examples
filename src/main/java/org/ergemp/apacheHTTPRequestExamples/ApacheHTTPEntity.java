package org.ergemp.apacheHTTPRequestExamples;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;

public class ApacheHTTPEntity {
    public static void main(String[] args) throws IOException {
        StringEntity myEntity = new StringEntity("important message",
                ContentType.create("text/plain", "UTF-8"));

        System.out.println(myEntity.getContentType());
        System.out.println(myEntity.getContentLength());
        System.out.println(EntityUtils.toString(myEntity));
        System.out.println(EntityUtils.toByteArray(myEntity).length);

        // In order to ensure proper release of system resources
        // one must close either the content stream associated with the entity or the response itself
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://httpbin.org/");
        CloseableHttpResponse response = httpclient.execute(httpget);

        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                long len = entity.getContentLength();

                if (len != -1 && len < 2048) {

                    //if you need to read the entity more than once
                    //entity = new BufferedHttpEntity(entity);
                    InputStream instream = entity.getContent();

                    try {
                        int byteOne = instream.read();
                        int byteTwo = instream.read();

                        // do something useful
                    } finally {
                        instream.close();
                    }
                }
            }
        } finally {
            response.close();
        }
    }
}
