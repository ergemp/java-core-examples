package org.ergemp.exceptionHandling;

public class OverviewExamples {

    public static void main(String[] args) {

        // ArithmeticException
        try {
            int a=50/0;
            // Exception in thread "main" java.lang.ArithmeticException: / by zero
        }
        catch (ArithmeticException aex) {
            System.out.println(aex.getMessage());
        }

        // NullPointerException
        try {
            String s = null;
            System.out.println(s.length());
            // Exception in thread "main" java.lang.NullPointerException
        }
        catch(NullPointerException npex){
            System.out.println(npex.getMessage());
        }

        // NumberFormatException
        try {
            String s = "abc";
            int i = Integer.parseInt(s);
            // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        }
        catch(NumberFormatException nfex){
            System.out.println(nfex.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int a[] = new int[5];
            a[10] = 50;
            // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
        }
        catch(ArrayIndexOutOfBoundsException aiobex){
            System.out.println(aiobex.getMessage());
        }

    }
}
