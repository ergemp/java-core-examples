package org.ergemp.dateTimeExamples.javaUtilExamples;

import java.util.Calendar;
import java.util.TimeZone;

public class JavaUtilTimeZoneExamples {
    public static void main(String[] args) {

        // Java TimeZone class represents a time zone offset,
        // and also figures out daylight savings. It inherits the Object class.

        // Example: getAvailableIDs()

        String[] id = TimeZone.getAvailableIDs();
        System.out.println("In TimeZone class available Ids are: ");
        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i]);
        }

        // Example: getOffset()
        TimeZone zone = TimeZone.getTimeZone("Europe/Istanbul");
        System.out.println("The Offset value of TimeZone: " +  zone.getOffset(Calendar.ZONE_OFFSET));
        // The Offset value of TimeZone: 7200000

        // Example: getID()
        TimeZone timezone = TimeZone.getTimeZone("Europe/Istanbul");
        System.out.println("Value of ID is: " + timezone.getID());
        // Value of ID is: Europe/Istanbul

        TimeZone x = TimeZone.getDefault();
        String name = x.getDisplayName();
        System.out.println("Display name for default time zone: " + name);
        // Display name for default time zone: Eastern European Time

        // Example: getDefault()
        System.out.println("The ID of the default TimeZone is: " + x.getID());
        // The ID of the default TimeZone is: Europe/Istanbul

        // Example: setID()
        TimeZone tz = TimeZone.getDefault();

        // setting the time zone ID
        tz.setID("GMT + 07:01");

        // checking for the time zone ID
        System.out.println("The Time zone ID is: " + tz.getID());





    }
}
