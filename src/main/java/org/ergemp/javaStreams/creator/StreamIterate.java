package org.ergemp.javaStreams.creator;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args)
    {
        Stream<Integer> streamIterated = Stream.iterate(1, n -> n + 2).limit(5);
        streamIterated.forEach(System.out::println);
    }
}
