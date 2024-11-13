package org.ergemp.base64Examples;

import java.util.Base64;
import java.util.UUID;

public class MIMEEncodeDecodeExample {

    // The MIME encoder generates a Base64-encoded output using the basic alphabet. However, the format is MIME-friendly.
    // Each line of the output is no longer than 76 characters. Also, it ends with a carriage return followed by a linefeed (\r\n)

    public static void main(String[] args) {
        StringBuilder buffer = getMimeBuffer();
        byte[] encodedAsBytes = buffer.toString().getBytes();
        String encodedMime = Base64.getMimeEncoder().encodeToString(encodedAsBytes);

        System.out.println(encodedMime);

        byte[] decodedBytes = Base64.getMimeDecoder().decode(encodedMime);
        String decodedMime = new String(decodedBytes);

        System.out.println(decodedMime);

    }

    private static StringBuilder getMimeBuffer() {
        StringBuilder buffer = new StringBuilder();
        for (int count = 0; count < 10; ++count) {
            buffer.append(UUID.randomUUID().toString());
        }
        return buffer;
    }
}
