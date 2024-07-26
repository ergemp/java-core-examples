package org.ergemp.basics.branching;

public class IfExamples {
    public static void main(String[] args) {

        String input = "abcdefg";
        String sOne = "abc" ;
        String sTwo = "cde" ;
        String sTree = "123" ;

        // if example
        if (input.contains(sOne))
        {
            System.out.println("TRUE");
        }
        if (input.contains(sTree))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

        // if example with AND
        if (input.contains(sOne) && input.contains(sTree))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

        // if example with OR
        if (input.contains(sOne) || input.contains(sTwo))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

        // else if example
        if (input.contains(sOne))
        {
            System.out.println("TRUE");
        }
        else if (input.contains(sTwo))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
}
