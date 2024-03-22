package org.ergemp.fileIOExamples;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {

        // The Java Console class is be used to get input from console.
        // It provides methods to read texts and passwords.

        // If you read password using Console class, it will not be displayed to the user.

        // The java.io.Console class is attached with system console internally.
        // The Console class is introduced since 1.5.

        //
        // example to read text from console.
        //

        /*
        -- ref: https://medium.com/@lavishj77/java-i-o-byte-stream-implementation-6acf5a9ec848

        System.in is an InputStream which is connected to keyboard input of console programs.
        So, if you want to give any input from your keyboard, you’d have to use System.in to read that input.
        We can read the input using same read() methods provided by InputStream.

        System.out is a PrintStream which is used to print something on console.
        We can use all methods provided by PrintStream with System.out,
        System.out.println being the most popularly used one.
        */

        String text = System.console().readLine();
        System.out.println("Text is: " + text);

        //
        //
        //
        Console c = System.console();
        System.out.println("Enter your name: ");

        String n = c.readLine();
        System.out.println("Welcome " + n);

        //
        // read password example
        //

        System.out.println("Enter password: ");
        char[] ch = c.readPassword();

        String pass = String.valueOf(ch); //converting char array into string
        System.out.println("Password is: " + pass);



    }
}

/*
    Reader reader()	                                It is used to retrieve the reader object associated with the console
    String readLine()	                            It is used to read a single line of text from the console.
    String readLine(String fmt, Object... args)	    It provides a formatted prompt then reads the single line of text from the console.
    char[] readPassword()	                        It is used to read password that is not being displayed on the console.
    char[] readPassword(String fmt, Object... args)	It provides a formatted prompt then reads the password that is not being displayed on the console.
    Console format(String fmt, Object... args)	    It is used to write a formatted string to the console output stream.
    Console printf(String format, Object... args)	It is used to write a string to the console output stream.
    PrintWriter writer()	                        It is used to retrieve the PrintWriter object associated with the console.
    void flush()	                                It is used to flushes the console.
*/