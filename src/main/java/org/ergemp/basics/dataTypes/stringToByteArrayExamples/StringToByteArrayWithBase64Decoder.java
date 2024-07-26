package org.ergemp.basics.dataTypes.stringToByteArrayExamples;

import java.util.Base64;

import static org.junit.Assert.assertEquals;

public class StringToByteArrayWithBase64Decoder {
    public static void main(String[] args) {

        String originalInput = "dGVzdCBpbnB1dA==";
        byte[] result = Base64.getDecoder().decode(originalInput);

        assertEquals("test input", new String(result));

    }
}
