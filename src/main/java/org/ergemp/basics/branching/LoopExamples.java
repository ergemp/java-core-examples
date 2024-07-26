package org.ergemp.basics.branching;

public class LoopExamples {
    public static void main(String[] args) {

        int i=5;

        // while loop
        while (i>0)
        {
            System.out.println("Hello world");
            i--;
        }

        // do while loop
        i = 5;
        do {
            System.out.println("Hello world");
            i--;
        } while (i>0);

        // for loop
        for (int j=1; j<=10; j++)
        {
            System.out.println(j);
        }

    }
}
