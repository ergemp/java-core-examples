package org.ergemp.fileIOExamples.characterStreams;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {

        // Java BufferedReader class is used to read the text from a character-based input stream.
        // It can be used to read data line by line by readLine() method.
        // It makes the performance fast. It inherits Reader class.

        FileReader fr = new FileReader("data/testout.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while((i = br.read()) != -1){
            System.out.print((char)i);
        }

        br.close();
        fr.close();

        //
        // configure buffers for 10 chars manually
        //

        System.out.println("");

        FileReader fr2 = new FileReader("data/testout.txt");
        BufferedReader br2 = new BufferedReader(fr2);

        char[] buffer = new char[10];
        while((br2.read(buffer)) != -1){
            System.out.print(new String(buffer));
            buffer = new char[10];
        }

        br2.close();
        fr2.close();


        //
        //
        //

        // BufferedReader provides an additional readLine() method which allows to read one line from buffer at a time.
        // It returns null when there are no more lines.

        // Reading line from console using BufferedReader
        // InputStreamReader isr = new InputStreamReader(System.in);

        System.out.println("");

        InputStreamReader isr = new InputStreamReader(new FileInputStream("data/fileTest.txt"));
        br = new BufferedReader(isr);
        String data = br.readLine();
        while(data != null){
            System.out.println(data);
            data = br.readLine();
        }

    }
}

/*
    int read()	                                It is used for reading a single character.
    int read(char[] cbuf, int off, int len)	    It is used for reading characters into a portion of an array.
    boolean markSupported()	                    It is used to test the input stream support for the mark and reset method.
    String readLine()	                        It is used for reading a line of text.
    boolean ready()	                            It is used to test whether the input stream is ready to be read.
    long skip(long n)	                        It is used for skipping the characters.
    void reset()	                            It repositions the stream at a position the mark method was last called on this input stream.
    void mark(int readAheadLimit)	            It is used for marking the present position in a stream.
    void close()	                            It closes the input stream and releases any of the system resources associated with the stream.
 */