package org.ergemp.dataStructures.arrays;

public class ArrayExample {
    public static void main(String[] args) {

        //
        //
        //
        // declaration and instantiation
        int a[] = new int[5];

        a[0] = 10; //initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        // traversing array
        for(int i=0; i<a.length; i++) // length is the property of array
            System.out.println(a[i]);

        //
        //
        //

        // declaration, instantiation and initialization
        int b[] = {33,3,4,5};

        // printing array
        for(int i=0; i<b.length; i++) // length is the property of array
            System.out.println(b[i]);

        //
        //
        //

        int arr[] = {33,3,4,5};

        //printing array using for-each loop
        for(int i:arr)
            System.out.println(i);

    }
}
