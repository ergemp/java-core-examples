package org.ergemp.fileIOExamples.byteStreams;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/java-bytearrayoutputstream-class

        // Java ByteArrayOutputStream class is used to write common data into multiple files.
        // In this stream, the data is written into a byte array which can be written to multiple streams later.

        // The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
        // The buffer of ByteArrayOutputStream automatically grows according to data.

        //
        // example of java ByteArrayOutputStream class to write common data into 2 files: f1.txt and f2.txt.
        //
        try {
            FileOutputStream fout1 = new FileOutputStream("data/f1.txt");
            FileOutputStream fout2 = new FileOutputStream("data/f2.txt");

            ByteArrayOutputStream bout=new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.flush();
            bout.close();//has no effect

            System.out.println("Success...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //
        // ref: https://medium.com/@lavishj77/java-i-o-byte-stream-implementation-6acf5a9ec848
        //
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        //write() method implementation same as that of FileOutputputStream.
        byte[] bar = bos.toByteArray();
        //obtaining all bytes into a byte array

    }
}
