package org.ergemp.dateTime.javaTimeExamples;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class JavaTimeOffsetTimeExamples {
    public static void main(String[] args) {

        // Java OffsetTime class is an immutable date-time object that represents a time,
        // often viewed as hour-minute-second offset.
        // It inherits Object class and implements the Comparable interface.

        OffsetTime offset = OffsetTime.now();
        int h = offset.get(ChronoField.HOUR_OF_DAY);
        System.out.println(h);
        int m = offset.get(ChronoField.MINUTE_OF_DAY);
        System.out.println(m);
        int s = offset.get(ChronoField.SECOND_OF_DAY);
        System.out.println(s);
        /*
        16
        1010
        60645
        */

        //
        // Example: getHour()
        //

        int h2 = offset.getHour();
        System.out.println(h2 + " hour");
        //16 hour

        //
        // Example: getMinute()
        //

        int m2 = offset.getMinute();
        System.out.println(m2 + " minute");
        //52 minute

        //
        // Example: getSecond()
        //

        int s2 = offset.getSecond();
        System.out.println(s2 + " second");
        //36 second

    }
}
