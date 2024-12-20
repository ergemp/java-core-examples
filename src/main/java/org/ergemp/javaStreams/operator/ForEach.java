package org.ergemp.javaStreams.operator;

import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args)
    {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
