package org.ergemp.dataStructures.collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesPlainJava {
    public static void main(String[] args){
        List<Integer> listWithDuplicates = Arrays.asList(0, 1, 2, 3, 0, 0);
        List<Integer> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));
    }
}
