package org.ergemp.dateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentDateTimeWithJavaUtilDate {
    public static void main(String[] args) {

        //
        // The SimpleDateFormat class is also used for formatting date and time. But it is old approach.
        //

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        //27/11/2023 13:40:45

        // first approach
        java.util.Date date2 = new java.util.Date();
        System.out.println(date2);
        //Mon Nov 27 13:50:37 EET 2023

        // second approach
        long millis = System.currentTimeMillis();
        java.util.Date date3 = new java.util.Date(millis);
        System.out.println(date3);
        //Mon Nov 27 13:51:08 EET 2023

        // Note:
        // It is recommended to use the Calendar class for getting the current date and time in classical Date API.
        // Since Java 8, you can use LocalDate, LocalTime, or LocalDateTime classes.

    }
}
