package org.ergemp.uuidRandomExamples;

import java.util.UUID;

public class GeneerateUUID {
    public static void main(String[] args){
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
    }
}
