package org.ergemp.dateTimeExamples.javaTimeExamples;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class JavaTimeZoneOffsetExamples {
    public static void main(String[] args) {

        /*
        Java ZoneOffset class is used to represent the fixed zone offset from UTC time zone.
        It inherits the ZoneId class and implements the Comparable interface.

        The ZoneOffset class declares three constants:

        MAX: It is the maximum supported zone offsets.
        MIN: It is the minimum supported zone offsets.
        UTC: It is the time zone offset constant for UTC.
        */

        ZoneOffset zone = ZoneOffset.UTC;
        Temporal temp = zone.adjustInto(ZonedDateTime.now());
        System.out.println(temp);
        //2023-11-27T18:05:07.528374+03:00[Europe/Istanbul]

        //
        // Example: ofHours()
        //

        ZoneOffset zone2 = ZoneOffset.ofHours(5);
        System.out.println(zone2);
        //+05:00

        //
        // Example: ofHoursMinutes()
        //
        zone = ZoneOffset.ofHoursMinutes(5,30);
        System.out.println(zone);
        //+05:30

        //
        // Example: isSupported()
        //
        zone = ZoneOffset.UTC;
        boolean b1 = zone.isSupported(ChronoField.OFFSET_SECONDS);
        System.out.println(b1);
        boolean b2 = zone.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(b2);
        //true
        //false

    }
}
