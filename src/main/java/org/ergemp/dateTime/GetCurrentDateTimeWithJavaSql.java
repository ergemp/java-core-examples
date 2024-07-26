package org.ergemp.dateTime;

public class GetCurrentDateTimeWithJavaSql {
    public static void main(String[] args) {

        // By printing the instance of java.sql.Date class, you can print current date in Java.
        // It doesn't print time.
        // This date instance is generally used to save the current date in the database.

        long millis=System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);
        //2023-11-27

    }
}
