package org.ergemp.dataStructures.collections.arrayList;

import java.util.*;

public class ArrayListExample3 {
    public static void main(String[] args) {

        java.util.Scanner reader = new Scanner(System.in);
        ArrayList<String> memory = new ArrayList<String>();

        while(true)
        {
            memory.add(reader.nextLine());
            System.out.println(memory.toString());
        }

    }
}
