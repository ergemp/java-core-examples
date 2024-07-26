package org.ergemp.dateTime;

public class GetCurrentDateTimeWithJavaUtilCalendar {
    public static void main(String[] args) {

        // The Calendar class can be used to get the instance of the Date class.
        // The getTime() method of the Calendar class returns the instance of java.util.Date.
        // The Calendar.getInstance() method returns the instance of the Calendar class.

        long millis=System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);

        // Note:
        // It is recommended to use the Calendar class for getting the current date and time in classical Date API.
        // Since Java 8, you can use LocalDate, LocalTime, or LocalDateTime classes.
    }
}
