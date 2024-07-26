package org.ergemp.basics.dataTypes.stringToByteArrayExamples;

import javax.xml.bind.DatatypeConverter;

import static org.junit.Assert.assertEquals;

public class HexStringToByteArray {
    public static void main(String[] args) {
        String originalInput = "7465737420696E707574";
        byte[] result = DatatypeConverter.parseHexBinary(originalInput);

        assertEquals("test input", new String(result));

    }
}
