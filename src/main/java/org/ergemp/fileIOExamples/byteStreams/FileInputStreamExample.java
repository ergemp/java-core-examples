package org.ergemp.fileIOExamples.byteStreams;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {

        // Java FileInputStream class obtains input bytes from a file.
        // It is used for reading byte-oriented data (streams of raw bytes) such as
        // image data, audio, video etc.
        // You can also read character-stream data.
        // But, for reading streams of characters, it is recommended to use FileReader class.

        //
        // example 1: read single character
        //
        try {
            FileInputStream fin = new FileInputStream("data/testout.txt");
            int i = fin.read();
            System.out.print((char) i);

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        //
        // example 2: read all characters
        //
        try {
            FileInputStream fin = new FileInputStream("data/testout.txt");

            int i = 0;
            while((i = fin.read()) != -1) {
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        //
        // example 3:
        //
        System.out.println("");
        try {
            FileInputStream fin2 = new FileInputStream("data/testout.txt");
            byte[] buffer = new byte[10];

            int i = 0;
            while((fin2.read(buffer)) != -1) {
                System.out.print(new String(buffer));
                buffer = new byte[10];
            }
            fin2.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
