package org.ergemp.javaStreams.creator;

import java.util.List;
import java.util.stream.Stream;

public class EmptyStream {
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.empty();
        stream.forEach(System.out::println);
    }

    //It's often the case that the  empty() method is used
    //upon creation to avoid returning null for streams with no element:

    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
