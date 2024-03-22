package org.ergemp.dateTimeExamples.javaUtilExamples;

import java.util.Date;

public class JavaUtilDateExamples {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/java-util-date

        // The java.util.Date class represents date and time in java.
        // It provides constructors and methods to deal with date and time in java.

        // The java.util.Date class implements Serializable, Cloneable and Comparable<Date> interface.
        // It is inherited by java.sql.Date, java.sql.Time and java.sql.Timestamp interfaces.

        // After Calendar class, most of the constructors and methods of java.util.Date class has been deprecated.
        // Here, we are not giving list of any deprecated constructor and method.

        java.util.Date date = new java.util.Date();
        System.out.println(date);
        //Tue Nov 28 15:55:02 EET 2023

        long millis=System.currentTimeMillis();
        java.util.Date date2 = new java.util.Date(millis);
        System.out.println(date2);

        // setTime() example

        // A date object is created with the specified time.
        Date d = new Date();
        System.out.println("Initial date is: " + d);
        // setting the time for 1000000 milliseconds after
        // 01 January, 1970, 00:00:00 GMT.
        d.setTime(1000000);
        // Printing the time
        System.out.println("Date after the setting the time is: " + d);
        /*
        Initial date is: Tue Nov 28 16:54:29 EET 2023
        Date after the setting the time is: Thu Jan 01 02:16:40 EET 1970
        */



    }
}
