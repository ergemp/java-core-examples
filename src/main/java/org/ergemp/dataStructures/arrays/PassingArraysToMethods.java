package org.ergemp.dataStructures.arrays;

public class PassingArraysToMethods {
    public static void main (String[] args) {
        int a[] = {33,3,4,5}; // declaring and initializing an array
        min(a); // passing array to method
    }

    static void min (int arr[]) {

        int min = arr[0];
        for (int i=1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
