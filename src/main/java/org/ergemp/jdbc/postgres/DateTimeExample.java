package org.ergemp.jdbc.postgres;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Properties;

public class DateTimeExample {
    public static void main(String[] args){
        //create table ttest2 (col1 varchar(100), col2 varchar(100), col3 integer, col4 date);
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://phadoop01:5432/hive";
            Properties props = new Properties();
            props.setProperty("user", "hadoop");
            props.setProperty("password", "hellori123");

            Connection conn = DriverManager.getConnection(url, props);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ttest2");
            while (rs.next()) {
                System.out.println("Column 4 returned ");
                LocalDate localDate = rs.getObject(4, LocalDate.class);
                System.out.println(localDate.getEra());
                System.out.println(localDate);
            }
            rs.close();

            LocalDateTime localDateTime = LocalDateTime.now();
            LocalDate localDate = LocalDate.now();

            PreparedStatement pStmt = conn.prepareStatement("insert into ttest2 values('foo', 'bar', 2, ?)");
            pStmt.setObject(1, localDate);
            pStmt.executeUpdate();

            pStmt.setObject(1, localDateTime);
            pStmt.executeUpdate();

            stmt.close();
        }
        catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
        catch(SQLException sqlex) {
            sqlex.printStackTrace();
        }
        finally {

        }
    }
}
