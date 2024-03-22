package org.ergemp.fileIOExamples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    static final String FILEPATH ="data/testout.txt";

    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/java-randomaccessfile-class

        // This class is used for reading and writing to random access file.
        // A random access file behaves like a large array of bytes.
        // There is a cursor implied to the array called file pointer,
        // by moving the cursor we do the read write operations.
        //
        // If end-of-file is reached before the desired number of byte has been read than EOFException is thrown.
        // It is a type of IOException.

        try {
            System.out.println(new String(readFromFile(FILEPATH, 0, 18)));
            writeToFile(FILEPATH, "I love my country and my people", 55);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readFromFile(String filePath, int position, int size) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String filePath, String data, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
