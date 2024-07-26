package org.ergemp.dateTime.javaTimeExamples;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class JavaTimeInstantExamples {
    public static void main(String[] args) {

        // Java Instant class is used to represent the specific moment on the time line.
        // It inherits the Object class and implements the Comparable interface.

        Instant inst = Instant.parse("2024-02-03T10:37:30.00Z");
        System.out.println(inst);
        //2024-02-03T10:37:30Z

        //
        // Example: now()
        //

        Instant instant = Instant.now();
        System.out.println(instant);
        //2023-11-28T11:38:01.944416Z

        //
        // Example: minus() plus()
        //
        Instant instant2 = Instant.parse("2017-02-03T11:25:30.00Z");
        instant2 = instant2.minus(Duration.ofDays(125));
        System.out.println(instant2);
        //2016-10-01T11:25:30Z

        Instant inst1 = Instant.parse("2017-02-03T11:25:30.00Z");
        Instant inst2 = inst1.plus(Duration.ofDays(125));
        System.out.println(inst2);
        //2017-06-08T11:25:30Z

        Instant insts = Instant.parse("2017-02-03T11:35:30.00Z");
        System.out.println(insts.isSupported(ChronoUnit.DAYS));
        System.out.println(insts.isSupported(ChronoUnit.YEARS));
        /*
        true
        false
        */


    }
}
