package org.ergemp.dateTime.javaTimeExamples;

import java.time.OffsetDateTime;

public class JavaTimeOffsetDateTimeExamples {
    public static void main(String[] args) {

        // Java OffsetDateTime class is an immutable representation of a date-time with an offset.
        // It inherits Object class and implements the Comparable interface.
        // OffsetDateTime class is used to store the date and time fields, to a precision of nanoseconds.

        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT.toLocalDate());
        System.out.println(offsetDT.getDayOfMonth());
        System.out.println(offsetDT.getDayOfYear());
        System.out.println(offsetDT.getDayOfWeek());
        /*
        2023-11-27
        27
        331
        MONDAY
        */

        OffsetDateTime minusDays = offsetDT.minusDays(240);
        OffsetDateTime plusDays = offsetDT.plusDays(240);
        System.out.println(minusDays);
        System.out.println(plusDays);
        /*
        2023-04-01T17:04:24.820018+03:00
        2024-07-24T17:04:24.820018+03:00
        */






    }
}
