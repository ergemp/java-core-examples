package org.ergemp.dateTimeExamples.workshop;

public class JavaTimeExamples {
    public static void main(String[] args) {

        /*
        *
        Both Date classes are outmoded.
        * Sun, Oracle, and the JCP community gave up on those
        * legacy date-time classes years ago with the
        * unanimous adoption of JSR 310 defining the java.time classes.

        Use java.time classes instead of legacy java.util.Date & java.sql.Date with JDBC 4.2 or later.
        Convert to/from java.time if inter-operating with code not yet updated to java.time.

        Legacy	                Modern	                Conversion
        java.util.Date	        java.time.Instant	    java.util.Date.toInstant()
                                                        java.util.Date.from( Instant )
        java.sql.Date	        java.time.Date	        java.sql.Date.toLocalDate()
                                                        java.sql.Date.valueOf( LocalDate )
        *
        *
        * */

        //https://stackoverflow.com/questions/530012/how-to-convert-java-util-date-to-java-sql-date

        /*
        *
        * Replacements:
        Instant instead of java.util.Date
        Both represent a moment in UTC. but now with nanoseconds instead of milliseconds.

        LocalDate instead of java.sql.Date
        Both represent a date-only value without a time of day and without a time zone.
*
* */
    }
}
