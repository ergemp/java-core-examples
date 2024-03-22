package org.ergemp.fileIOExamples.byteStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ProblemWithByteStreamsExample {
    public static void main(String[] args) throws IOException {

        // As we know now that byte streams read data byte by byte,
        // also it can take more than one byte to represent Unicode characters.

        // Suppose we have a Unicode character in a file that takes more than one byte (say a Hebrew character ‘ל’)
        // and we are using read() method of FileInputStream that’d read only one byte at a time
        // and if we try to convert each byte into char, in that case we will not get correct data out of file.

        File file = new File("data/fileTest.txt");

        OutputStream fos = new FileOutputStream(file);
        InputStream fis = new FileInputStream(file);

        fos.write("ל".getBytes(StandardCharsets.UTF_8));

        int data = fis.read(); //read and return value for first byte only

        System.out.println((char)data); // will not print 'ל'

        fis.close();
        fos.flush();
        fos.close();
    }
}
