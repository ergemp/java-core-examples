package org.ergemp.dataStructures.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        Integer[] arr2 = { 5, -2, 23, 7, 87, -42, 509 };


        System.out.println("The original array is: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        Arrays.sort(arr);

        System.out.println("\nThe sorted array is: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        Arrays.sort(arr2, Collections.reverseOrder());

        System.out.println("\nThe reverse sorted array is: ");

        for (int num : arr2) {
            System.out.print(num + " ");
        }


    }
}
