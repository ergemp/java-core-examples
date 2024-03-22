package org.ergemp.fileIOExamples.byteStreams;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) {

        // The ByteArrayInputStream is composed of two words: ByteArray and InputStream.
        // As the name suggests, it can be used to read byte array as input stream.

        // Java ByteArrayInputStream class contains an internal buffer which is used to read byte array as stream.
        // In this stream, the data is read from a byte array.

        // The buffer of ByteArrayInputStream automatically grows according to data.

        //
        // example of java ByteArrayInputStream class to read byte array as input stream.
        //
        byte[] buf = { 35, 36, 37, 38 };
        // Create the new byte array input stream
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            //Conversion of a byte into character
            char ch = (char) k;
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }

        //
        // ref: https://medium.com/@lavishj77/java-i-o-byte-stream-implementation-6acf5a9ec848
        //
        String text = "Awesome Java";
        ByteArrayInputStream bis = new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8));
        //read() method implementation is same as that of FileInputStream.


    }
}
