package org.ergemp.dataStructures.collections.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>(); // Creating arraylist
        list.add("Mango"); // Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // Printing the arraylist object
        System.out.println(list);

        //
        // get, set examples
        //

        // it will return the 2nd element, because index starts from 0
        System.out.println("Returning element: " + list.get(1));

        // changing the element
        list.set(1,"Dates");

        // Traversing list
        for(String fruit : list)
            System.out.println(fruit);
    }
}
