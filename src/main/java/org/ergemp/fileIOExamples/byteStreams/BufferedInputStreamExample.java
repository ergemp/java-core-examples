package org.ergemp.fileIOExamples.byteStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/java-bufferedinputstream-class

        // Java BufferedInputStream class is used to read information from stream.
        // It internally uses buffer mechanism to make the performance fast.

        // The important points about BufferedInputStream are:

        // When the bytes from the stream are skipped or read,
        // the internal buffer automatically refilled from the contained input stream, many bytes at a time.

        // When a BufferedInputStream is created, an internal buffer array is created.

        try {
            FileInputStream fin = new FileInputStream("data/testout.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);

            int i;
            while((i = bin.read()) != -1) {
                System.out.print((char)i);
            }
            bin.close();
            fin.close();

            //
            // ref: https://medium.com/@lavishj77/java-i-o-byte-stream-implementation-6acf5a9ec848
            //

            //to add custom buffer size
            int bufferSize = 8 * 1024;
            BufferedInputStream bos = new BufferedInputStream(
                    new FileInputStream("data/inputFile.txt"), bufferSize);

            BufferedOutputStream output = new BufferedOutputStream(
                    new FileOutputStream("data/outputFile.txt"), bufferSize);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
