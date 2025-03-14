package org.ergemp.javaStreams.operator;

import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args)
    {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }
}

/*
filter: d2
filter: a2
map: a2
forEach: A2
filter: b1
filter: b3
filter: c
*/