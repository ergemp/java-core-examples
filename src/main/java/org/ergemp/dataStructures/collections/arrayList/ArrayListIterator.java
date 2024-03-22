package org.ergemp.dataStructures.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
        list.add("Mango"); // Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        // Traversing list through Iterator
        Iterator itr = list.iterator(); // getting the Iterator
        while (itr.hasNext()) { //check if iterator has the elements
            System.out.println(itr.next()); //printing the element and move to next
        }

        // Traversing list through for-each loop
        for(String fruit:list)
            System.out.println(fruit);

        //
        //
        //

        // Creating arraylist
        list = new ArrayList<String>();

        // Adding object in arraylist
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("Traversing list through List Iterator:");

        // Here, element iterates in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious()) {
            String str=list1.previous();
            System.out.println(str);
        }

        //
        //
        //

        System.out.println("Traversing list through for loop:");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        //
        //
        //

        System.out.println("Traversing list through forEach() method:");

        // The forEach() method is a new feature, introduced in Java 8.
        // // Here, we are using lambda expression
        list.forEach(a->{
            System.out.println(a);
        });

        System.out.println("Traversing list through forEachRemaining() method:");

        itr = list.iterator();
        // Here, we are using lambda expression
        itr.forEachRemaining(a->
        {
            System.out.println(a);
        });

    }
}
