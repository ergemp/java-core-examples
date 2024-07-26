package org.ergemp.basics.dataTypes.stringToByteArrayExamples;

import javax.xml.bind.DatatypeConverter;

import static org.junit.Assert.assertEquals;

public class WithDataTypeConverter {
    public static void main(String[] args) {
        String originalInput = "dGVzdCBpbnB1dA==";
        byte[] result = DatatypeConverter.parseBase64Binary(originalInput);

        assertEquals("test input", new String(result));

    }
}
