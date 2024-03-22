package org.ergemp.fileIOExamples.byteStreams;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {

        // If you have to write primitive values into a file, use FileOutputStream class.
        // You can write byte-oriented as well as character-oriented data through FileOutputStream class.
        //
        // But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.
        // ref: https://www.javatpoint.com/java-fileoutputstream-class

        //
        // Example 1: write byte
        //
        try {
            FileOutputStream fout = new FileOutputStream("data/testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }
        catch(Exception e){
            System.out.println(e);
        }

        //
        // Example 2: write string
        //
        try{
            FileOutputStream fout=new FileOutputStream("data/testout.txt");
            String s="Welcome to javaTpoint.";
            byte b[]=s.getBytes(); //converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }
        catch(Exception e){
            System.out.println(e);
        }



    }
}
