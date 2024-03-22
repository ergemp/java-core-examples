package org.ergemp.fileIOExamples.characterStreams;

import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) throws IOException {

        //Data to write on Console using PrintWriter
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Javatpoint provides tutorials of all technology.");
        writer.flush();
        writer.close();

        //Data to write in File using PrintWriter
        PrintWriter writer1 = null;
        writer1 = new PrintWriter(new File("data/testout.txt"));
        writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
        writer1.flush();
        writer1.close();

        //
        //
        // ref: https://medium.com/@lavishj77/java-i-o-character-stream-implementation-c105bd6238c
        // The PrintWriter class enables you to write formatted data to an underlying Writer.
        // The PrintWriter class can format primitive types like int, long etc. formatted as text
        //

        File file = new File("data/fileTest.txt");
        FileWriter  fwriter = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fwriter);

        //write() method is same as before
        pw.write(65);
        pw.write("\nHello\n");

        //below are some of the extra methods provided by PrintWriter
        pw.print("Using print\n");
        pw.println("Using println");
        pw.format("%s is %s %d\n","Java", "Awesome",1);
        pw.printf("%s is %s %d","Java", "Awesome",2);

        //format and printf have exactly same implementation
        pw.flush();
        writer.flush();
        pw.close();
        writer.close();


    }
}
