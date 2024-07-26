package org.ergemp.dateTime.javaUtilExamples;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendarExamples {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/java-util-calendar

        // Java Calendar class is an abstract class that provides methods for converting
        // date between a specific instant in time and a set of calendar fields
        // such as MONTH, YEAR, HOUR, etc. It inherits Object class and implements the Comparable interface.

        Calendar calendar = Calendar.getInstance();
        System.out.println("The current date is : " + calendar.getTime());
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 years later: " + calendar.getTime());
        /*
        The current date is : Tue Nov 28 15:58:39 EET 2023
        15 days ago: Mon Nov 13 15:58:39 EET 2023
        4 months later: Wed Mar 13 15:58:39 EET 2024
        2 years later: Fri Mar 13 15:58:39 EET 2026
        */

        // get() example
        Calendar calendar2 = Calendar.getInstance();
        System.out.println("At present Calendar's Year: " + calendar2.get(Calendar.YEAR));
        System.out.println("At present Calendar's Day: " + calendar2.get(Calendar.DATE));
        /*
        At present Calendar's Year: 2023
        At present Calendar's Day: 28
        */

        // getInstance() example
        Calendar calendar3 = Calendar.getInstance();
        System.out.println("At present Date And Time Is: " + calendar3.getTime());

        // getMaximum() getMinimim() example
        calendar = Calendar.getInstance();
        int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum number of days in week: " + maximum);
        maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Maximum number of weeks in year: " + maximum);
        /*
        Maximum number of days in week: 7
        Maximum number of weeks in year: 53
        */

        int minimum = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Minimum number of days in week: " + minimum);
        minimum = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Minimum number of weeks in year: " + minimum);
        /*
        Minimum number of days in week: 1
        Minimum number of weeks in year: 1
        */


        // Creating an object of Calendar
        // by invoking the getInstance method
        Calendar cln = Calendar.getInstance();
        // Setting the Month
        // The months begin with 0. 0 means January
        cln.set(Calendar.MONTH, 07);
        // Setting Date
        cln.set(Calendar.DATE, 12);
        // Setting Year
        cln.set(Calendar.YEAR, 2021);
        // Creating an object of the class Date
        // with the mentioned time.
        Date d = cln.getTime();
        Instant instt = d.toInstant();
        System.out.println("The original Date is: " + d.toString());
        System.out.println("The instant is: " + instt);
        /*
        The original Date is: Thu Aug 12 16:57:49 EET 2021
        The instant is: 2021-08-12T13:57:49.549Z
        */


    }
}
