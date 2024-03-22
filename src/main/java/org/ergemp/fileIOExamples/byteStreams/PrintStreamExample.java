package org.ergemp.fileIOExamples.byteStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PrintStreamExample {
    public static void main(String[] args) throws IOException {

        // ref: https://www.javatpoint.com/java-printstream-class
        // ref: https://medium.com/@lavishj77/java-i-o-byte-stream-implementation-6acf5a9ec848

        // The PrintStream class enables you to write formatted data to an underlying OutptStream.
        // The PrintStream class can format primitive types like int, long etc.
        // formatted as text, rather than as their byte values.

        FileOutputStream fout=new FileOutputStream("data/testout.txt ");
        PrintStream pout=new PrintStream(fout);
        pout.println(2016);
        pout.println("Hello Java");
        pout.println("Welcome to Java");
        pout.close();
        fout.close();
        System.out.println("Success?");


        //
        //
        //

        File file = new File("data/fileTest.txt");
        OutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);

        //write() method is same as before
        ps.write(65);
        ps.write("\nHello\n".getBytes(StandardCharsets.UTF_8));

        //below are some of the extra methods provided by PrintStream
        ps.print("Using print\n");
        ps.println("Using println");
        ps.format("%s is %s %d\n","Java", "Awesome",1);
        ps.printf("%s is %s %d","Java", "Awesome",2);

        //format and printf have exactly same implementation
        ps.flush();
        fos.flush();
        ps.close();
        fos.close();

    }
}

/*
    void print(boolean b)	It prints the specified boolean value.
    void print(char c)	    It prints the specified char value.
    void print(char[] c)	It prints the specified character array values.
    void print(int i)	    It prints the specified int value.
    void print(long l)	    It prints the specified long value.
    void print(float f)	    It prints the specified float value.
    void print(double d)	It prints the specified double value.
    void print(String s)	It prints the specified string value.
    void print(Object obj)	It prints the specified object value.
    void println(boolean b)	It prints the specified boolean value and terminates the line.
    void println(char c)	It prints the specified char value and terminates the line.
    void println(char[] c)	It prints the specified character array values and terminates the line.
    void println(int i)	    It prints the specified int value and terminates the line.
    void println(long l)	It prints the specified long value and terminates the line.
    void println(float f)	It prints the specified float value and terminates the line.
    void println(double d)	It prints the specified double value and terminates the line.
    void println(String s)	It prints the specified string value and terminates the line.
    void println(Object obj)	It prints the specified object value and terminates the line.
    void println()	        It terminates the line only.
    void printf(Object format, Object... args)	            It writes the formatted string to the current stream.
    void printf(Locale l, Object format, Object... args)	It writes the formatted string to the current stream.
    void format(Object format, Object... args)	            It writes the formatted string to the current stream using specified format.
    void format(Locale l, Object format, Object... args)	It writes the formatted string to the current stream using specified format.

 */
