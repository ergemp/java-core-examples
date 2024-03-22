package org.ergemp.fileIOExamples.workshop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayToFile {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("pathname");

            //byte[] myvar = "Any String you want".getBytes();
            byte[] myByteArray = new byte[20];

            fos.write(myByteArray);

            // fos.close();
            // There is no more need for this line since you had created the instance of "fos" inside the try.
            // And this will automatically close the OutputStream
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
