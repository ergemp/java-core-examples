package org.ergemp.dataStructures.arrays;

import java.util.Arrays;

public class ArrayExamples2 {
    public static void main(String[] args) {

        // array declaration
        char[] arrayVar = new char[7];
        arrayVar[2] = 'c';

        // array declaration with initial values
        char[]  arrayVar2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        // print the alphabet example

        // 97
        char[] alpha = new char[26];

        for(int i = 0; i < 26; i++)
        {
            alpha[i] = (char)(97 + i);
        }
        System.out.println(Arrays.toString(alpha));

        // multi-dimentional arrays
        char[][] twoDimArr = new char[3][7];



    }
}
