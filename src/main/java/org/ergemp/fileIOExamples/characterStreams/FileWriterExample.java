package org.ergemp.fileIOExamples.characterStreams;

import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) {

        // Java FileWriter class is used to write character-oriented data to a file.
        // It is character-oriented class which is used for file handling in java.

        // Unlike FileOutputStream class, you don't need to convert string into byte array
        // because it provides method to write string directly.

        try {
            FileWriter fw = new FileWriter("data/testout.txt");
            fw.write("Welcome to javaTpoint ttt.");
            fw.close();

            //
            // ref: https://medium.com/@lavishj77/java-i-o-character-stream-implementation-c105bd6238c
            //

            File file = new File("data/fileTest.txt");

            Writer fw1 = new FileWriter(file); //by default overwrites the file
            Writer fw2 = new FileWriter(file,false); //true means append the file
            Writer fw3 = new FileWriter(file,true); //false means overwrite file
            fw3.write("first line\n");
            fw3.append("test append\n");

            // writing char array
            char[] tt = "char array".toCharArray();
            fw3.write(tt, 2,2);
            fw3.write(tt, 8,2);

            fw3.flush();
            fw3.close();

            //write methods are same as discussed for OutputStreamWriter
            Reader fr= new FileReader(file);
            //read methods are same as discussed for InputStreamReader


        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}

/*
    void write(String text)	It is used to write the string into FileWriter.
    void write(char c)	    It is used to write the char into FileWriter.
    void write(char[] c)	It is used to write char array into FileWriter.
    void flush()	        It is used to flushes the data of FileWriter.
    void close()	        It is used to close the FileWriter.
 */