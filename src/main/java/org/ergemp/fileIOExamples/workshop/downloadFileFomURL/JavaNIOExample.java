package org.ergemp.fileIOExamples.workshop.downloadFileFomURL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class JavaNIOExample {
    public static void main(String[] args)  {

        URL url = null;
        try {
            url = new URL("https://images-cloud.emlakjet.com/sitemaps/live/detail_kiralik_desktop_2.xml");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());

            FileOutputStream fileOutputStream = new FileOutputStream("mockdata/detail_kiralik_desktop_2.xml");
            FileChannel fileChannel = fileOutputStream.getChannel();

            fileOutputStream.getChannel()
                    .transferFrom(readableByteChannel, 0, Long.MAX_VALUE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
