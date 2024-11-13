package org.ergemp.fileIOExamples.httpIOExamples;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class JavaIOExample {
    public static void main(String[] args){

        String FILE_URL = "https://images-cloud.emlakjet.com/sitemaps/live/detail_kiralik_desktop_2.xml";
        String FILE_NAME = "mockdata/detail_kiralik_desktop_2.xml";

        try (BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)) {
                byte dataBuffer[] = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                    fileOutputStream.write(dataBuffer, 0, bytesRead);
                }
            } catch (IOException e) {
                // handle exception
            }

        /*
        InputStream in = new URL(FILE_URL).openStream();
        Files.copy(in, Paths.get(FILE_NAME), StandardCopyOption.REPLACE_EXISTING);
        * */
    }
}
