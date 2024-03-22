package org.ergemp.dateTimeExamples.workshop;

import java.time.ZoneId;
import java.util.Calendar;

public class DateTimeExamples {
    public void run()
    {

        //
        //create a new calendar
        //set and get date
        //
        Calendar tmpCal = Calendar.getInstance();

        tmpCal.set(2017, 11, 6);
        tmpCal.set(2017, 11, 6, 13, 29, 0);
        System.out.println("tmpCal First: " + tmpCal.getTime()) ;
        //Wed Dec 06 13:29:00 EET 2017

        System.out.println(tmpCal.get(Calendar.YEAR) + " " + tmpCal.get(Calendar.MONTH) + " " + tmpCal.get(Calendar.DAY_OF_MONTH));
        //2017 11 6


        //
        //create a new java.util.date
        //set date /w deprecated functions
        //
        java.util.Date tmpDate = new java.util.Date();
        tmpDate.setYear(2017);
        tmpDate.setMinutes(32);
        tmpDate.setHours(13);
        tmpDate.setMonth(11);
        tmpDate.setSeconds(0);

        //
        //convert java.util.date to java.util.calendar
        //
        tmpCal.setTimeInMillis(tmpDate.getTime());
        tmpCal.setTime(tmpDate);
        //tmpCal.set(java.util.Calendar.YEAR, 2017);
        //tmpCal.set(java.util.Calendar.MONTH, 11);
        System.out.println("tmpCal Second: " + tmpCal.getTime());
        //Thu Dec 06 13:32:00 EET 3917


        //
        //create a new java.util.date
        //set date /w java.text.DateFormat (not deprecated)
        //
        java.util.Date tmpDate2 = new java.util.Date();
        try
        {
            String sDate = "2017-11-06 13:38:00";
            java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.ENGLISH);
            tmpDate2 = format.parse(sDate);
            System.out.println("tmpDate2: " + tmpDate2);
            //Mon Nov 06 13:38:00 EET 2017
        }
        catch(java.text.ParseException ex)
        {
            System.err.println(ex);
        }

        //
        //date comparison between java.util.dates
        //
        if (tmpDate2.after(tmpDate))
        {
            System.out.println("after");
        }
        else
        {
            System.out.println("not after");
        }

        //
        //date comparison between java.util.date and java.util.calendar
        //
        if (tmpDate2.after(tmpCal.getTime()))
        {
            System.out.println("after");
        }
        else
        {
            System.out.println("not after");
        }


        //
        //convert java.util.date / java.util.calendar to java.sql.data
        //
        System.out.println(new java.sql.Timestamp(tmpDate2.getTime()));
        System.out.println(new java.sql.Timestamp(tmpCal.getTimeInMillis()));

        /*
        If you are trying to work with date-only values (no time-of-day, no time zone),
        use the LocalDate class rather than java.util.Date.
        */

        java.time.LocalDate tmpLocalDate ;
        tmpLocalDate = java.time.LocalDate.now();
        System.out.println("tmpLocalDate: " + tmpLocalDate.toString());

        //
        //get the current datetime with java.util.date
        //use of java.time is the latest for time and date variables
        //
        java.util.Date current = new java.util.Date();
        java.time.LocalDateTime tmpLocalDateTime = current.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("tmpLocalDateTime: " + tmpLocalDateTime.toString());


        java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        java.util.Date tmpDate3 = new java.util.Date();
        System.out.println("tmpDate3: " + dateFormat.format(tmpDate3));
        //2017/11/06 13:16:09


        //
        //get current datetime with java.util.calendar
        //
        Calendar tmpCal2 =  Calendar.getInstance();
        System.out.println("tmpCal2: " + dateFormat.format(tmpCal2.getTime()));


        //
        //get current datetime with java.time
        //
        java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        java.time.LocalDateTime tmpNow = java.time.LocalDateTime.now();
        System.out.println("java.time.LocalDateTime: " + dtf.format(tmpNow));

        java.time.LocalDate tmpNow2 = java.time.LocalDate.now();
        System.out.println("java.time.LocalDate: " + java.time.format.DateTimeFormatter.ofPattern("yyy/MM/dd").format(tmpNow2));


        //
        //date differences with java.util.date
        //
        java.text.DateFormat dateDiffFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String sDate1 = "2017/11/06 12:00:00";
        String sDate2 = "2017/11/03 16:18:06";

        try
        {
            java.util.Date date2 = dateDiffFormat.parse(sDate1);
            java.util.Date date1 = dateDiffFormat.parse(sDate2);


            long diff = date2.getTime() - date1.getTime();
            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            System.out.print(diffDays + " days, ");
            System.out.print(diffHours + " hours, ");
            System.out.print(diffMinutes + " minutes, ");
            System.out.println(diffSeconds + " seconds.");

        }
        catch(java.text.ParseException ex)
        {
            System.err.println(ex);
        }

        //
        //date differences with java.time
        //
        java.time.LocalDateTime  dt1 = java.time.LocalDateTime.of(2017, 11, 6, 14, 51, 0);
        java.time.LocalDateTime  dt2 = java.time.LocalDateTime.of(2017, 11, 3, 03, 30, 10);

        java.time.LocalDateTime tempDateTime = java.time.LocalDateTime.from( dt2 );

        long years = dt2.until( dt1, java.time.temporal.ChronoUnit.YEARS);
        long months = dt2.until( dt1, java.time.temporal.ChronoUnit.MONTHS);
        long days = dt2.until( dt1, java.time.temporal.ChronoUnit.DAYS);
        long hours = dt2.until( dt1, java.time.temporal.ChronoUnit.HOURS);
        long minutes = dt2.until( dt1, java.time.temporal.ChronoUnit.MINUTES);
        long seconds = dt2.until( dt1, java.time.temporal.ChronoUnit.SECONDS);

        System.out.println(years + " years, " + months + " months, " + days + " days, " + hours%24 + " hours, " + minutes%60 + " minutes");


        //
        //formatting dates
        //

        String oldstring = "2011-01-18 00:00:00.0";
        java.time.LocalDateTime datetime =
                java.time.LocalDateTime.parse
                        (oldstring, java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));

        System.out.println(datetime);
        //2011-01-18T00:00

        String newstring = datetime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(newstring);
        //2011-01-18

        //Or, when you're not on Java 8 yet, use SimpleDateFormat#parse()
        //to parse a String in a certain pattern into a Date.
        try
        {
            String oldstring2 = "2011-01-18 00:00:00.0";

            //parse a String in a certain pattern into a Date.
            java.util.Date date = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(oldstring2);
            System.out.println(date);
            //Tue Jan 18 00:00:00 EET 2011

            //Use SimpleDateFormat#format() to format a Date into a String in a certain pattern.
            String newstring2 = new java.text.SimpleDateFormat("yyyy-MM-dd").format(date);
            System.out.println(newstring2);
            //2011-01-18
        }
        catch(Exception Ex)
        {

        }

        //
        //get time with timezone
        //
        //with java.util.calendar
        java.util.TimeZone tz = java.util.TimeZone.getTimeZone("GMT+1");
        Calendar c = Calendar.getInstance(tz);
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //with java.time
        final ZoneId zoneId = ZoneId.of("Europe/Zurich");
        final java.time.ZonedDateTime zonedDateTime = java.time.ZonedDateTime.ofInstant(java.time.Instant.now(), zoneId);
        System.out.println(zonedDateTime.format(java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME));

        java.time.ZonedDateTime zonedDateTime2 = java.time.ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        java.time.LocalTime localTime2 = zonedDateTime2.toLocalTime();

        System.out.println(localTime2);

        //
        //
        //
        String[] zoneIds = java.util.TimeZone.getAvailableIDs();

        for (int i = 0; i < zoneIds.length; i++) {
            java.util.TimeZone tz2 = java.util.TimeZone.getTimeZone(zoneIds[i]);
            System.out.print(tz2.getID() + " " + tz2.getDisplayName());

            Calendar calTZ = new java.util.GregorianCalendar(tz2);
            calTZ.setTimeInMillis(new java.util.Date().getTime());

            Calendar cal2 = Calendar.getInstance();

            cal2.set(Calendar.YEAR, calTZ.get(Calendar.YEAR));
            cal2.set(Calendar.MONTH, calTZ.get(Calendar.MONTH));
            cal2.set(Calendar.DAY_OF_MONTH, calTZ.get(Calendar.DAY_OF_MONTH));
            cal2.set(Calendar.HOUR_OF_DAY, calTZ.get(Calendar.HOUR_OF_DAY));
            cal2.set(Calendar.MINUTE, calTZ.get(Calendar.MINUTE));
            cal2.set(Calendar.SECOND, calTZ.get(Calendar.SECOND));
            cal2.set(Calendar.MILLISECOND, calTZ.get(Calendar.MILLISECOND));
            System.out.println( "  "+cal2.getTime());
        }
    }
}
