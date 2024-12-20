package org.ergemp.apacheHTTPRequestExamples;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;

public class ApacheHTTPURIBuilder {
    public static void main(String[] args) {

        URI uri = null;
        try {
            uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("www.google.com")
                    .setPath("/search")
                    .setParameter("q", "httpclient")
                    .setParameter("btnG", "Google Search")
                    .setParameter("aq", "f")
                    .setParameter("oq", "")
                    .build();
            HttpGet httpget = new HttpGet(uri);
            System.out.println(httpget.getURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
