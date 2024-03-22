package org.ergemp.fileIOExamples.characterStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {

        // Java BufferedWriter class is used to provide buffering for Writer instances.
        // It makes the performance fast. It inherits Writer class.
        // The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.

        FileWriter writer = new FileWriter("data/testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to javaTpoint.");
        buffer.close();
        System.out.println("Success");

    }
}

/*
    void newLine()	                            It is used to add a new line by writing a line separator.
    void write(int c)	                        It is used to write a single character.
    void write(char[] cbuf, int off, int len)	It is used to write a portion of an array of characters.
    void write(String s, int off, int len)	    It is used to write a portion of a string.
    void flush()	                            It is used to flushes the input stream.
    void close()	                            It is used to closes the input stream

 */
