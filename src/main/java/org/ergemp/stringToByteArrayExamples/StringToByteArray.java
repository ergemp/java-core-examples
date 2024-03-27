package org.ergemp.stringToByteArrayExamples;

import static org.junit.Assert.assertEquals;

public class StringToByteArray {
    public static void main(String[] args) {
        String originalInput = "test input";
        byte[] result = originalInput.getBytes();

        assertEquals(originalInput.length(), result.length);
    }
}
