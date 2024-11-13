package org.ergemp.javaStreams.creator;

import java.util.*;
import java.util.stream.Stream;

public class FromCollection {
    public static void main(String[] args)
    {
        //A Stream object can be created with any type of Collection (Collection, List, Set):

        //from collection
        Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");

        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        //from list
        List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");

        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        //from set
        Set<String> set = new HashSet<>(list);

        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);
    }
}
