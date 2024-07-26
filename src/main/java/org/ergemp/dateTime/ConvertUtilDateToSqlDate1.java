package org.ergemp.dateTime;

public class ConvertUtilDateToSqlDate1 {

    public static void main(String[] args) {
        //ref: https://stackoverflow.com/questions/530012/how-to-convert-java-util-date-to-java-sql-date
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        System.out.println("utilDate:" + utilDate);
        System.out.println("sqlDate:" + sqlDate);
    }
}
