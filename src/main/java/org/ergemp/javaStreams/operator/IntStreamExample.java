package org.ergemp.javaStreams.operator;

import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args)
    {
        IntStream.range(1, 4)
                .forEach(System.out::println);
    }
}
