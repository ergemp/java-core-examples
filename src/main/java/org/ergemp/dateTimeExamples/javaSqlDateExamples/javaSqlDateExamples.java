package org.ergemp.dateTimeExamples.javaSqlDateExamples;

import java.sql.Date;

public class javaSqlDateExamples {
    public static void main(String[] args) {

        // The java.sql.Date class represents the only date in Java. It inherits the java.util.Date class.

        // The java.sql.Date instance is widely used in the JDBC
        // because it represents the date that can be stored in a database.

        // Some constructors and methods of java.sql.Date class has been deprecated.
        // Here, we are not giving the list of any deprecated constructor and method.

        // Example: get current date

        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        System.out.println(date);

        String str="2015-03-31";
        Date date2= Date.valueOf(str); //converting string into sql date
        System.out.println(date2);






    }
}
