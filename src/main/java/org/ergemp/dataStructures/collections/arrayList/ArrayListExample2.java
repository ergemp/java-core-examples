package org.ergemp.dataStructures.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {

        //create a double list
        List<Double> myList = new ArrayList<Double>();
        //add a new element to list
        myList.add(0.00);
        //alter the first element of a list
        myList.set(0,100.00);

        System.out.println("if my list contains the element 0: " + myList.contains(0));
        System.out.println("if my list contains the element 1: " + myList.contains(1));

        System.out.println("size of the list: " + myList.size());
        System.out.println("first element of the list: " + myList.get(0));


        String one = " 1.2000 ";

        //increment the first element of the string by 1.2
        myList.set(0,myList.get(0) + Double.parseDouble(one.trim()));
        System.out.println("first element of the list increased by 1.2: " + myList.get(0));

        String sCsv1 = "1,2";
        String sCsv2 = "1";

        System.out.println("length of the sCsv1 list: " + sCsv1.split(",").length);

        //add more elements to my list
        myList.add(1,200.00);
        myList.add(2,210.00);
        myList.add(3,50.00);
        myList.add(4,20.00);
        myList.add(5,20.01);

        //sort the string
        Collections.sort(myList);
        System.out.println("Sorted list of the elements in myList: " + myList.toString());

        //walking in the list with iterator
        Iterator it = myList.listIterator();

        while (it.hasNext()) {
            Double dd = Double.parseDouble(it.next().toString());
            System.out.println(dd);
        }

        /*
        List<Fruit> fruits= new ArrayList<Fruit>();
        Fruit fruit;

        for(int i = 0; i < 100; i++)
        {
            fruit = new Fruit();
            fruit.setname(...);
            fruits.add(fruit);
        }

        // Sorting
        Collections.sort(fruits, new Comparator<Fruit>()
            {
                @Override
                public int compare(Fruit fruit2, Fruit fruit1)
                {
                    return  fruit1.fruitName.compareTo(fruit2.fruitName);
                }
            });
        */
    }
}
