package org.ergemp.fileIOExamples.httpIOExamples;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class ResumableDownloadExample {
    public static void main(String[] args) {

        String FILE_URL = "https://images-cloud.emlakjet.com/sitemaps/live/detail_kiralik_desktop_2.xml";
        String FILE_NAME = "mockdata/detail_kiralik_desktop_2.xml";

        URL url = null;
        try {
            url = new URL(FILE_URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection httpConnection = null;
        try {
            httpConnection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            httpConnection.setRequestMethod("HEAD");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }
        long removeFileSize = httpConnection.getContentLengthLong();

        /*
        long existingFileSize = outputFile.length();
        if (existingFileSize < fileLength) {
            httpFileConnection.setRequestProperty(
                    "Range",
                    "bytes=" + existingFileSize + "-" + fileLength
            );
        }

        BufferedInputStream in = new BufferedInputStream(new URL(FILE_URL).openStream())

        try {
            OutputStream os = new FileOutputStream(FILE_NAME, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
    }
}
