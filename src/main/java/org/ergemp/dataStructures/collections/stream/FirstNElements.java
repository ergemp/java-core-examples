package org.ergemp.dataStructures.collections.stream;

import java.util.Arrays;
import java.util.List;

public class FirstNElements {
    public static void main(String[] args) {

        List<Integer> listWithDuplicates = Arrays.asList(1,1,2,2,3,3);

        listWithDuplicates.stream().limit(2).forEach(System.out::println);
    }
}
