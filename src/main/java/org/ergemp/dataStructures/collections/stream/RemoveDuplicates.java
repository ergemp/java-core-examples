package org.ergemp.dataStructures.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args){

        String stringWithDuplicates = "1,1,2,2,3,3";

        //List<String> listWithDuplicates = Arrays.asList(stringWithDuplicates.split(","));
        List<Integer> listWithDuplicates = Arrays.asList(1,1,2,2,3,3);

        //List<Integer> listWithoutDuplicates = listWithDuplicates.stream()
        listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(each -> System.out.println(each));
    }
}
