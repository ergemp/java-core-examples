package org.ergemp.HTTPRequestExamples;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;

import java.io.File;

public class ApacheHTTPEntityProduce {
    public static void main(String[] args) {

        // Producing entity content
        // HttpClient provides several classes that can be used to efficiently stream out content through HTTP connections.
        // Instances of those classes can be associated with entity enclosing requests such as POST and PUT
        // in order to enclose entity content into outgoing HTTP requests.
        //
        // HttpClient provides several classes for most common data containers such as
        // string, byte array, input stream, and file: StringEntity, ByteArrayEntity, InputStreamEntity, and FileEntity.

        File file = new File("somefile.txt");
        FileEntity entity = new FileEntity(file,
                ContentType.create("text/plain", "UTF-8"));

        HttpPost httppost = new HttpPost("http://httpbin.org/");
        httppost.setEntity(entity);

    }
}
