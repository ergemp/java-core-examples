package org.ergemp.dateTime.javaTimeExamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JavaTimeLocalDateTimeExamples {
    public static void main(String[] args) {

        // Java LocalDateTime class is an immutable date-time object that represents a date-time,
        // with the default format as yyyy-MM-dd-HH-mm-ss.zzz.
        // It inherits object class and implements the ChronoLocalDateTime interface.

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);
        /*
        Before Formatting: 2023-11-27T16:34:39.757812
        After Formatting: 27-11-2023 16:34:39
        */

        LocalDateTime datetime1 = LocalDateTime.now();
        String formatDateTime1 = datetime1.format(format);
        System.out.println(formatDateTime1);
        //27-11-2023 16:35:20

        //
        // Example: get()
        //

        LocalDateTime a = LocalDateTime.of(2017, 2, 13, 15, 56);
        System.out.println(a.get(ChronoField.DAY_OF_WEEK));
        System.out.println(a.get(ChronoField.DAY_OF_YEAR));
        System.out.println(a.get(ChronoField.DAY_OF_MONTH));
        System.out.println(a.get(ChronoField.HOUR_OF_DAY));
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
        /*
        1
        44
        13
        15
        956
        */

        //
        // Example: minusDays()
        //
        LocalDateTime datetime2 = LocalDateTime.of(2017, 1, 14, 10, 34);
        LocalDateTime datetime3 = datetime2.minusDays(100);
        System.out.println("Before Formatting: " + datetime3);
        String formatDateTime2 = datetime3.format(format);
        System.out.println("After Formatting: " + formatDateTime2 );
        /*
        Before Formatting: 2016-10-06T10:34
        After Formatting: 06-10-2016 10:34:00
        */

        //
        // Example: plusDays()
        //

        LocalDateTime datetime4 = LocalDateTime.of(2017, 1, 14, 10, 34);
        LocalDateTime datetime5 = datetime4.plusDays(120);
        System.out.println("Before Formatting: " + datetime4);
        String formatDateTime3 = datetime5.format(format);
        System.out.println("After Formatting: " + formatDateTime3 );
        /*
        Before Formatting: 2017-01-14T10:34
        After Formatting: 14-05-2017 10:34:00
        */

        // example: toLocalDate()

        // Getting the instance of LocalDateTime
        LocalDateTime dtm = LocalDateTime.now();
        // Getting the LocalDate representation of the LocalDateTime
        // using the toLocalDate() method
        System.out.println("The date is: " + dtm.toLocalDate());
        // The date is: 2023-11-28

    }
}
