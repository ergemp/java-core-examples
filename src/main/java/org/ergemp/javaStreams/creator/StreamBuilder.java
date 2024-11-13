package org.ergemp.javaStreams.creator;

import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args)
    {
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
        streamBuilder.forEach(System.out::println);
    }
}
