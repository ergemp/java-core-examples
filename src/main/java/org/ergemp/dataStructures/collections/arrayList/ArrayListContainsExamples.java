package org.ergemp.dataStructures.collections.arrayList;

import java.util.ArrayList;

public class ArrayListContainsExamples {
    public static void main(String[] args) {
        // creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(4);

        // using add() to initialize values
        // [1, 2, 3, 4]
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // use contains() to check if the element
        // 2 exits or not
        boolean ans = arr.contains(2);

        if (ans)
            System.out.println("The list contains 2");
        else
            System.out.println("The list does not contains 2");

        // use contains() to check if the element
        // 5 exits or not
        ans = arr.contains(5);

        if (ans)
            System.out.println("The list contains 5");
        else
            System.out.println("The list does not contains 5");

        // creating an Empty String ArrayList
        ArrayList<String> arr2 = new ArrayList<String>(4);

        // using add() to initialize values
        // ["geeks", "for", "geeks"]
        arr2.add("geeks");
        arr2.add("for");
        arr2.add("geeks");

        // use contains() to check if the element
        // "geeks" exits or not
        ans = arr2.contains("geeks");

        if (ans)
            System.out.println("The list contains geeks");
        else
            System.out.println("The list does not contains geeks");

        // use contains() to check if the element
        // "coding" exits or not
        ans = arr2.contains("coding");

        if (ans)
            System.out.println("The list contains coding");
        else
            System.out.println("The list does not contains coding");
    }
}
