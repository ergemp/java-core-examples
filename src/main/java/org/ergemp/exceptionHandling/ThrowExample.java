package org.ergemp.exceptionHandling;

public class ThrowExample {
    public static void main(String[] args) {

        //calling the function
        try {
            validate(13);
            System.out.println("rest of the code...");
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }

    }

    // function to check if person is eligible to vote or not
    public static void validate(int age) {
        if(age<18) {
            // throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
}
