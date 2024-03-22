package org.ergemp.fileIOExamples.workshop.commonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ByteArrayToFile {
    public static void main(String[] args){
        byte[] myByteArray = "Any String you want".getBytes();
        try {
            FileUtils.writeByteArrayToFile(new File("pathname"), myByteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
