package org.ergemp.basics.branching;

public class ScannerExample {
    public static void main(String[] args) {

        // java.util.Scanner reader;

        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Input now: ");
        Integer input = reader.nextInt();
        System.out.println(input);

        if (input > 10)
        {
            System.out.println("MORE!");
        }
        {
            System.out.println("LESS!");
        }

    }
}
