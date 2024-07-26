package org.ergemp.basics.dataTypes;

public class IntTypeExamples {
    public static void main(String[] args) {

        // The maximum integer value is 2147483647 and the minimum integer value is -2147483648.

        int x;
        int y;

        x = 4;
        y = 3;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        x = -10;
        y = 5;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        x = 2147483647;
        x++;
        System.out.println(x);

    }
}
