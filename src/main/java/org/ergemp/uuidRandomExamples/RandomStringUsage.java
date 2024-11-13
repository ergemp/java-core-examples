package org.ergemp.uuidRandomExamples;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomStringUsage {
    public static void main(String[] args){
        RandomString gen = new RandomString(8, ThreadLocalRandom.current());
        RandomString session = new RandomString();

        String easy = RandomString.digits + "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwx";
        RandomString tickets = new RandomString(23, new SecureRandom(), easy);

        System.out.println(gen.nextString());
        System.out.println(session.nextString());
        System.out.println(tickets.nextString());
    }
}
