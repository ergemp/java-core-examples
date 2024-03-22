package org.ergemp.dateTimeExamples.javaTimeExamples;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class JavaTimeZoneIdExamples {
    public static void main(String[] args) {

        // Java ZoneId class specifies a time zone identifier and provides a rule for
        // converting between an Instant and a LocalDateTime.
        // It inherits Object class and implements the Serializable interface.

        // There are two sorts of ID:

        // Fixed offsets are fully resolved offsets from UTC/Greenwich that apply to all local date-times.
        // Geographical regions are areas where a set of rules for determining the offset from UTC/Greenwich apply.

        ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");
        ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");
        LocalTime id1 = LocalTime.now(zoneid1);
        LocalTime id2 = LocalTime.now(zoneid2);
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id1.isBefore(id2));
        /*
        20:07:56.516797
        23:37:56.516904
        true
        */

        //
        // Example: systemDefault()
        //

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        //Europe/Istanbul

        //
        // Example: getId()
        //
        ZoneId z = ZoneId.systemDefault();
        String s = z.getId();
        System.out.println(s);
        //Europe/Istanbul

        //
        // Example: getDisplayName()
        //
        System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));
        //Eastern European Time







    }
}
