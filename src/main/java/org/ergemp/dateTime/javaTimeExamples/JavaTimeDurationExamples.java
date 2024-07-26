package org.ergemp.dateTime.javaTimeExamples;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class JavaTimeDurationExamples {
    public static void main(String[] args) {

        // Java Duration class is used to measures time in seconds and nanoseconds.
        // It inherits the Object class and implements the Comparable interface.

        //
        // Example: get() between()
        //
        Duration d = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(d.get(ChronoUnit.SECONDS));
        //43199

        //
        // Example: isNegative()
        //
        Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);
        System.out.println(d1.isNegative());
        Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(d2.isNegative());
        /*
        true
        false
        */

        //
        // Example: minus() plus()
        //
        Duration dm1 = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(dm1.getSeconds());
        Duration dm2 = dm1.minus(dm1);
        System.out.println(dm2.getSeconds());

        Duration dp1 = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(dp1.getSeconds());
        Duration dp2 = dp1.plus(dp1);
        System.out.println(dp2.getSeconds());
        /*
        43199
        0
        43199
        86399
        */



    }
}
