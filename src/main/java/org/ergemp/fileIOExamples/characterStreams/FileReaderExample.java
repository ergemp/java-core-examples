package org.ergemp.fileIOExamples.characterStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("data/testout.txt");

        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();

    }
}
