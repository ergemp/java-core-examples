package org.ergemp.dataStructures.collections.arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        /*
        List in Java provides the facility to maintain the ordered collection.
        It contains the index-based methods to insert, update, delete and search the elements.
        It can have the duplicate elements also.
        We can also store the null elements in the list.
        */

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
