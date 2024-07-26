package org.ergemp.dateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatExamples {
    public static void main(String[] args) {

        // ref: https://www.javatpoint.com/java-date-format

        // There are two classes for formatting dates in Java: DateFormat and SimpleDateFormat.

        // The java.text.DateFormat class provides various methods to format and parse
        // date and time in java in language-independent manner.
        // The DateFormat class is an abstract class. java.text.
        // The Format is the parent class and java.text.SimpleDateFormat is the subclass of java.text.DateFormat class.

        // In Java, converting the date into the string is called formatting and vice-versa parsing.
        // In other words, formatting means date to string, and parsing means string to date.

        //
        // Example: Date to String
        //
        Date currentDate = new Date();
        System.out.println("Current Date: "+ currentDate);
        String dateToStr = DateFormat.getInstance().format(currentDate);
        System.out.println("Date Format using getInstance(): " + dateToStr);
        /*
        Current Date: Tue Nov 28 17:10:20 EET 2023
        Date Format using getInstance(): 11/28/23, 5:10 PM
        */

        System.out.println("Current Date: "+currentDate);

        dateToStr = DateFormat.getInstance().format(currentDate);
        System.out.println("Date Format using getInstance(): "+dateToStr);

        dateToStr = DateFormat.getDateInstance().format(currentDate);
        System.out.println("Date Format using getDateInstance(): "+dateToStr);

        dateToStr = DateFormat.getTimeInstance().format(currentDate);
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);

        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);

        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);
        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);

        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);

        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);


        //
        // Example: String to Date
        //
        Date d = null;
        try {
            d = DateFormat.getDateInstance().parse("Mar 28, 2015");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Date is: " + d);

        //
        // Example: getTimeInstance(int style, Locale locale)
        //

        // locale is French here.
        Locale lcl = Locale.FRENCH;

        // creating an object of the class Date
        d = new Date();

        // getting the instance by invoking the getTimeInstance(int, Locale) method
        DateFormat dFormat = DateFormat.getTimeInstance(DateFormat.SHORT, lcl);

        String str = dFormat.format(d);
        System.out.println(str);
        //17:15

        //
        // Example: getDateInstance(int style)
        //

        // creating an object of the class Date
        d = new Date();

        // getting the instance by invoking the getDateInstance(int) method
        // here default locale is used
        dFormat = DateFormat.getDateInstance(DateFormat.SHORT);

        str = dFormat.format(d);
        System.out.println(str);
        //11/28/23

        //
        // Example: getDateInstance(int style, Locale locale)
        //

        // locale is French here.
        lcl = Locale.ENGLISH;

        // creating an object of the class Date
        d = new Date();

        // getting the instance by invoking the getDateInstance(int, Locale) method
        dFormat = DateFormat.getDateInstance(DateFormat.SHORT, lcl);

        str = dFormat.format(d);
        System.out.println(str);
        //11/28/23

        //
        // Example: getDateTimeInstance(int dateStyle, int timeStyle, Locale locale)
        //

        // locale is French here.
        lcl = Locale.FRENCH;
        // creating an object of the class Date
        d = new Date();

        // getting the instance by invoking the getDateTimeInstance(int, int, Locale) method
        dFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, lcl);
        str = dFormat.format(d);
        System.out.println(str);
        //28/11/2023 17:22:09 EET




    }
}
