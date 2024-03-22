package org.ergemp.fileIOExamples.byteStreams;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamExample {
    public static void main(String[] args) throws IOException {

        // ref: https://www.javatpoint.com/java-sequenceinputstream-class
        // Java SequenceInputStream class is used to read data from multiple streams. It reads data sequentially (one by one).

        //
        // example, printing the data of two files testin.txt and testout.txt.
        //

        FileInputStream input1 = new FileInputStream("data/f1.txt");
        FileInputStream input2 = new FileInputStream("data/f2.txt");

        SequenceInputStream inst = new SequenceInputStream(input1, input2);

        int j;
        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }

        inst.close();
        input1.close();
        input2.close();

        //
        // Example: read the data from two files and write into another file
        //

        FileInputStream fin1 = new FileInputStream("data/f1.txt");
        FileInputStream fin2 = new FileInputStream("data/f2.txt");

        FileOutputStream fout = new FileOutputStream("data/f3.txt");

        SequenceInputStream sis = new SequenceInputStream(fin1, fin2);

        int i;
        while((i=sis.read())!=-1)
        {
            fout.write(i);
        }

        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success..");

        //
        // example that reads data using enumeration
        //

        //creating the FileInputStream objects for all the files
        FileInputStream finn1=new FileInputStream("data/f1.txt");
        FileInputStream finn2=new FileInputStream("data/f2.txt");
        FileInputStream finn3=new FileInputStream("data/f3.txt");

        //creating Vector object to all the stream
        Vector v=new Vector();
        v.add(finn1);
        v.add(finn2);
        v.add(finn3);

        //creating enumeration object by calling the elements method
        Enumeration e=v.elements();

        //passing the enumeration object in the constructor
        SequenceInputStream bin=new SequenceInputStream(e);
        int ii=0;
        while((ii=bin.read())!=-1){
            System.out.print((char)ii);
        }
        bin.close();
    }
}

/*
    int read()	                            It is used to read the next byte of data from the input stream.
    int read(byte[] ary, int off, int len)	It is used to read len bytes of data from the input stream into the array of bytes.
    int available()	                        It is used to return the maximum number of byte that can be read from an input stream.
    void close()	                        It is used to close the input stream.
*/