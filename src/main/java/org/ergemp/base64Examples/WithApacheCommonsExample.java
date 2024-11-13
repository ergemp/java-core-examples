package org.ergemp.base64Examples;

import org.apache.commons.codec.binary.Base64;

public class WithApacheCommonsExample {
    public static void main(String[] args) {
        String originalInput = "test input";
        Base64 base64 = new Base64();
        String encodedString = new String(base64.encode(originalInput.getBytes()));
        String decodedString = new String(base64.decode(encodedString.getBytes()));

        //with static API of base64
        String originalInput2 = "test input2";
        String encodedString2 = new String(Base64.encodeBase64(originalInput.getBytes()));
        String decodedString2 = new String(Base64.decodeBase64(encodedString.getBytes()));
    }
}
