package org.ergemp.base64Examples;

import java.util.Base64;

public class EncodeDecodeBase64 {
    public static void main(String[] args) {
        String originalInput = "test input";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());

        System.out.println(encodedString);

        //without padding
        //In Base64 encoding, the length of an output-encoded String must be a multiple of three.
        //The encoder adds one or two padding characters (=) at the end of the output as needed in order to meet this requirement.
        encodedString = Base64.getEncoder().withoutPadding().encodeToString(originalInput.getBytes());
        System.out.println(encodedString);


        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);

        System.out.println(decodedString);

    }
}
