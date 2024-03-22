package org.ergemp.exceptionHandlingExamples;

public class UserDefinedExceptionExample3 {
    public static void main(String[] args) {
        try {
            Exception customException = new Exception();
            throw (new Exception("exception message"));
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
