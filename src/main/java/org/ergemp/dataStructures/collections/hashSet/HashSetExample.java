package org.ergemp.dataStructures.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        // A list can contain duplicate elements whereas Set contains unique elements only.

        /*
        HashSet stores the elements by using a mechanism called hashing.
        HashSet contains unique elements only.
        HashSet allows null value.
        HashSet class is non synchronized.
        HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
        HashSet is the best approach for search operations.
        */

        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        Iterator<String> i=set.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

        //
        // ignoring duplicates
        //
        //Creating HashSet and adding elements
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Ravi");
        set2.add("Vijay");
        set2.add("Ravi");
        set2.add("Ajay");

        //Traversing elements
        Iterator<String> itr=set2.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
