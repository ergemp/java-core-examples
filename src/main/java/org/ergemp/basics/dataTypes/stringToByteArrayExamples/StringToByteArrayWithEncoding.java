package org.ergemp.basics.dataTypes.stringToByteArrayExamples;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertTrue;

public class StringToByteArrayWithEncoding {
    public static void main(String[] args) {
        String originalInput = "test input";
        byte[] result = originalInput.getBytes(StandardCharsets.UTF_16);

        assertTrue(originalInput.length() < result.length);

    }
}
