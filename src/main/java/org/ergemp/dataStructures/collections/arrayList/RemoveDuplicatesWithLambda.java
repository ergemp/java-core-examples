package org.ergemp.dataStructures.collections.arrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesWithLambda {
    public static void main(String[] args){
        List<Integer> listWithDuplicates = Arrays.asList(1, 1, 2, 2, 3, 3);
        List<Integer> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
