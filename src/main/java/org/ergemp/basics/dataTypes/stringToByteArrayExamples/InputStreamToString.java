package org.ergemp.basics.dataTypes.stringToByteArrayExamples;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.junit.Assert.assertEquals;

public class InputStreamToString {

    public static void main(String[] args) {

        String originalString = randomAlphabetic(16);
        InputStream inputStream = new ByteArrayInputStream(originalString.getBytes());

        StringBuilder textBuilder = new StringBuilder();

        try {
            Reader reader = new BufferedReader(new InputStreamReader (inputStream, StandardCharsets.UTF_8));

            int c = 0;
            while ((c = reader.read()) != -1) {
                textBuilder.append((char) c);
            }

            System.out.println(textBuilder);
        }
        catch (IOException iox) {
            iox.printStackTrace();
        }
        assertEquals(textBuilder.toString(), originalString);
    }
}
