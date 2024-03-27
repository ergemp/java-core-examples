package org.ergemp.dataStructures.collections.arrayList;

import java.util.ArrayList;

public class ArrayListContainsArrayItem {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList();
        ArrayList<String> arr2 = new ArrayList();

        // using add() to initialize values
        // [1, 2, 3, 4]
        arr1.add("ergem");
        arr1.add("peker");
        arr1.add("one");
        arr1.add("two");

        arr2.add("ergem");
        arr2.add("peker");

        Integer eqCount = 0;
        for (String item2 : arr2){
            for(String item1 : arr1) {
                if (item1.equalsIgnoreCase(item2)){
                    eqCount++;
                }
            }
        }
        System.out.println("total equal list items: " + eqCount);

        //with contains function
        eqCount = 0;
        for (String item2 : arr2) {
            if (arr1.contains(item2)) {
                eqCount ++;
            }
        }
        System.out.println("total equal list items: " + eqCount);


    }
}
