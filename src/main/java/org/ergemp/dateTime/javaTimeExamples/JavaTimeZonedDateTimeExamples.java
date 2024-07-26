package org.ergemp.dateTime.javaTimeExamples;

import java.time.*;

public class JavaTimeZonedDateTimeExamples {
    public static void main(String[] args) {

        // Java ZonedDateTime class is an immutable representation of a date-time with a time-zone.
        // It inherits Object class and implements the ChronoZonedDateTime interface.

        // ZonedDateTime class is used to store all date and time fields, to a precision of nanoseconds,
        // and a time-zone with a zone offset used to handle ambiguous local date-times.

        ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");
        System.out.println(zone);
        //2016-10-05T08:20:10+05:30[Asia/Kolkata]

        //
        // Example: of() and withZoneSameInstant()
        //

        LocalDateTime  ldt = LocalDateTime.of(2017, Month.JANUARY,  19,   15,   26);
        ZoneId  india = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zone1  = ZonedDateTime.of(ldt, india);
        System.out.println("In India Central Time Zone: " + zone1);
        ZoneId  tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zone2   = zone1.withZoneSameInstant(tokyo);
        System.out.println("In Tokyo Central Time Zone:"  + zone2);
        /*
        In India Central Time Zone: 2017-01-19T15:26+05:30[Asia/Kolkata]
        In Tokyo Central Time Zone:2017-01-19T18:56+09:00[Asia/Tokyo]
        */

        //
        // Example: getZone()
        //
        ZonedDateTime zone3 =ZonedDateTime.now();
        System.out.println(zone3.getZone());
        // Europe/Istanbul

        //
        // Example: minus()
        // Example: plus()
        //
        ZonedDateTime m = zone.minus(Period.ofDays(126));
        ZonedDateTime p = zone.plus(Period.ofDays(126));
        System.out.println(m);
        System.out.println(p);
        /*
        2016-06-01T08:20:10+05:30[Asia/Kolkata]
        2017-02-08T08:20:10+05:30[Asia/Kolkata]
        */






    }
}
