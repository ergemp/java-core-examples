package org.ergemp.dateTimeExamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetCurrentDateTimeWithJavaTime {
    public static void main(String[] args) {

        //
        // The LocalDateTime.now() method returns the instance of LocalDateTime class.
        // If we print the instance of LocalDateTime class, it prints the current date and time.
        // To format the current date, you can use DateTimeFormatter class which is included in JDK 1.8.
        //

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //2023-11-27T13:38:18.467190

        //
        // Formatted
        //

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(now));
        //2023/11/27 13:39:07

        //
        // The LocalDate.now() method returns the instance of the LocalDate class.
        // If we print the instance of the LocalDate class, it prints the current date.
        //

        System.out.println(java.time.LocalDate.now());
        //2023-11-27

        //
        // The LocalTime.now() method returns the instance of LocalTime class.
        // If we print the instance of LocalTime class, it prints the current time.
        //
        System.out.println(java.time.LocalTime.now());
        //13:49:04.694758

        //
        // The Clock.systemUTC().instant() method returns the current date and time both.
        //
        System.out.println(java.time.Clock.systemUTC().instant());
        //2023-11-27T10:49:04.694787Z

        // Note:
        // It is recommended to use the Calendar class for getting the current date and time in classical Date API.
        // Since Java 8, you can use LocalDate, LocalTime, or LocalDateTime classes.
    }
}
