package org.ergemp.apacheCommons.commonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadFileFromURL {
    public static void main(String[] args){

        String FILE_URL = "https://images-cloud.emlakjet.com/sitemaps/live/detail_kiralik_desktop_2.xml";
        String FILE_NAME = "mockdata/detail_kiralik_desktop_2.xml";

        Integer CONNECT_TIMEOUT = 60;
        Integer READ_TIMEOUT = 600;

        try {
            FileUtils.copyURLToFile(
                    new URL(FILE_URL),
                    new File(FILE_NAME),
                    CONNECT_TIMEOUT,
                    READ_TIMEOUT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        URLConnection connection = source.openConnection();
        connection.setConnectTimeout(connectionTimeout);
        connection.setReadTimeout(readTimeout);
        * */
    }
}
