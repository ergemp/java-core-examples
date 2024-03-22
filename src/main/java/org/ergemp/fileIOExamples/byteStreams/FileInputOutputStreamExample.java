package org.ergemp.fileIOExamples.byteStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileInputOutputStreamExample {
    public static void main(String[] args) throws IOException {

        // ref: https://medium.com/@lavishj77/java-i-o-byte-stream-implementation-6acf5a9ec848

        // Reading and Writing single byte at a time
        File file1 = new File("data/fileTest1.txt");
        File file2 = new File("data/fileTest2.txt");
        InputStream fis = new FileInputStream(file1);
        OutputStream fos = new FileOutputStream(file2);

        //reading file byte by byte and return the byte value of byte read
        int data = fis.read();

        while(data != -1){       //returns -1 when file ends
            System.out.print((char)data);
            //writing into file byte by byte
            fos.write(data);
            data = fis.read();
        }
        fos.flush();
        fos.close();
        fis.close();

        // Reading and writing data into and from byte array
        File file = new File("data/fileTest.txt");
        byte[] bar = new byte[50];      //note, byte array not char array
        String text = "Java is awesome";
        OutputStream foss = new FileOutputStream(file);
        foss.write(text.getBytes(StandardCharsets.UTF_8));
        foss.flush();
        foss.close();
        InputStream fiss = new FileInputStream(file);
        fiss.read(bar);
        for(byte b : bar){
            System.out.print((char)b);
        }
        fiss.close();

        /*
        Note that we could not always know the max size of bytearray required while reading data from a file to bytearray.
        So for this we can use Apache common's IOUtils.toByteArray(fileInputStream) to read data from fileInputStream into bytearray.
        Internally this creates a ByteArrayOutputStream and copies the bytes from FileInputStream  to the ByteArrayOutputStream,
        then calls toByteArray().

        e.g. - byte[] bytes = IOUtils.toByteArray(fileInputStream)
        */
    }
}
