package org.ergemp.dataStructures.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        Double[] myArray = {20.2, 20.5, 20.9, 30.0, 40.0, 50.0, 50.5, 50.9};
        List<Double> myList = Arrays.asList(myArray);

        //walking in the list with iterator
        Iterator it = myList.listIterator();

        while (it.hasNext()) {
            Double dd = Double.parseDouble(it.next().toString());
            System.out.println(dd);
        }
    }
}
