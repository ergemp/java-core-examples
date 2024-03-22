package org.ergemp.exceptionHandlingExamples;

import java.io.IOException;

public class ThrowsExample2 {
    static class Throws1 {
        void m()throws IOException {
            throw new IOException("device error");//checked exception
        }
    }
    public static void main(String[] args) {

        // The Java throws keyword is used to declare an exception.
        // It gives an information to the programmer that there may occur an exception.
        // So, it is better for the programmer to provide the exception handling code
        // so that the normal flow of the program can be maintained.
        
        Throws1 obj = new Throws1();
        try {
            obj.m();
            // Unhandled exception: java.io.IOException
            // compile time error
            // should handle exception or add the throws definition to method declaration
        }
        catch (IOException ioex){

        }

        System.out.println("normal flow...");

    }
}
