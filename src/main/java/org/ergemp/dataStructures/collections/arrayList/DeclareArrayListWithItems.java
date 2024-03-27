package org.ergemp.dataStructures.collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeclareArrayListWithItems {
    public static void main(String[] args) {
        Stream
                .of("xyz", "abc")
                .collect(Collectors.toList())
                .forEach(each -> System.out.println(each));

        List<String> x = new ArrayList<>(Arrays.asList("xyz", "abc"));
        System.out.println(x.toString());

        /*
        ArrayList()
        Constructs an empty list with an initial capacity of ten.

        ArrayList(Collection<? extends E> c) (*)
        Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.

        ArrayList(int initialCapacity)
        Constructs an empty list with the specified initial capacity.
        */
    }
}
