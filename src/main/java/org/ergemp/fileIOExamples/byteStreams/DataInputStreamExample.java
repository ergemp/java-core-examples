package org.ergemp.fileIOExamples.byteStreams;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {

        // Java DataInputStream class allows an application to read primitive data
        // from the input stream in a machine-independent way.

        // Java application generally uses the data output stream to write
        // data that can later be read by a data input stream.

        InputStream input = new FileInputStream("data/f1.txt");
        DataInputStream inst = new DataInputStream(input);

        int count = input.available();

        Integer t = inst.readInt();
        System.out.println(t);

        byte[] ary = new byte[count];

        inst.read(ary);
        for (byte bt : ary) {
            char k = (char) bt;
            System.out.print(k + "-");
        }
    }
}
/*
    int read(byte[] b)	                        It is used to read the number of bytes from the input stream.
    int read(byte[] b, int off, int len)	    It is used to read len bytes of data from the input stream.
    int readInt()	                            It is used to read input bytes and return an int value.
    byte readByte()	                            It is used to read and return the one input byte.
    char readChar()	                            It is used to read two input bytes and returns a char value.
    double readDouble()	                        It is used to read eight input bytes and returns a double value.
    boolean readBoolean()	                    It is used to read one input byte and return true if byte is non zero, false if byte is zero.
    int skipBytes(int x)	                    It is used to skip over x bytes of data from the input stream.
    String readUTF()	                        It is used to read a string that has been encoded using the UTF-8 format.
    void readFully(byte[] b)	                It is used to read bytes from the input stream and store them into the buffer array.
    void readFully(byte[] b, int off, int len)	It is used to read len bytes from the input stream.
*/