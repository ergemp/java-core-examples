package org.ergemp.dateTime.javaTimeExamples;

import java.time.Clock;
import java.time.Duration;

public class JavaTimeClockExamples {
    public static void main(String[] args) {

        // Java Clock class is used to provide an access to the current, date and time using a time zone.
        // It inherits the Object class.

        // Because all date-time classes contain a now() function that uses the system clock in the default time zone,
        // using the Clock class is not required.
        // The aim of the Clock class is to allow you to plug in another clock whenever you need it.
        // Instead of using a static method, applications utilise an object to get the current time.
        // It simplifies the testing process. A method that requires a current instant can take a Clock as a parameter.

        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());
        //Europe/Istanbul

        //
        // Example: systemUTC()
        // Example: instant()
        //
        Clock c2 = Clock.systemUTC();
        System.out.println(c2.instant());
        //2023-11-27T14:09:37.063625Z

        //
        // Example: offset()
        //
        Clock c3 = Clock.systemUTC();
        Duration d = Duration.ofHours(5);
        Clock clock = Clock.offset(c3, d);
        System.out.println(clock.instant());
        //2023-11-27T19:10:55.870287Z
        

    }
}
