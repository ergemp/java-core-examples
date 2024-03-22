package org.ergemp.fileIOExamples.byteStreams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        // Java DataOutputStream class allows an application to write
        // primitive Java data types to the output stream in a machine-independent way.

        // Java application generally uses the data output stream
        // to write data that can later be read by a data input stream.

        FileOutputStream file = new FileOutputStream("data/f1.txt");
        DataOutputStream data = new DataOutputStream(file);

        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Succcess...");


    }
}

/*
    int size()	                            It is used to return the number of bytes written to the data output stream.
    void write(int b)	                    It is used to write the specified byte to the underlying output stream.
    void write(byte[] b, int off, int len)	It is used to write len bytes of data to the output stream.
    void writeBoolean(boolean v)	        It is used to write Boolean to the output stream as a 1-byte value.
    void writeChar(int v)	                It is used to write char to the output stream as a 2-byte value.
    void writeChars(String s)	            It is used to write string to the output stream as a sequence of characters.
    void writeByte(int v)	                It is used to write a byte to the output stream as a 1-byte value.
    void writeBytes(String s)	            It is used to write string to the output stream as a sequence of bytes.
    void writeInt(int v)	                It is used to write an int to the output stream
    void writeShort(int v)	                It is used to write a short to the output stream.
    void writeShort(int v)	                It is used to write a short to the output stream.
    void writeLong(long v)	                It is used to write a long to the output stream.
    void writeUTF(String str)	            It is used to write a string to the output stream using UTF-8 encoding in portable manner.
    void flush()	                        It is used to flushes the data output stream.
 */