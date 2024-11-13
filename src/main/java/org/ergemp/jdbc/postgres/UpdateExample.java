package org.ergemp.jdbc.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class UpdateExample {
    public static void main(String[] args){
        //create table ttest (col1 varchar(100), col2 varchar(100), col3 integer);

        try{
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://phadoop01:5432/hive";
            Properties props = new Properties();
            props.setProperty("user", "hadoop");
            props.setProperty("password", "hellori123");

            Connection conn = DriverManager.getConnection(url, props);

            PreparedStatement pStmt = conn.prepareStatement("INSERT INTO ttest values (?,?,?)");
            pStmt.setString(1, "foo");
            pStmt.setString(2, "bar");
            pStmt.setInt(3, 1);

            int rowsInserted = pStmt.executeUpdate();
            System.out.println(rowsInserted + " rows inserted");
            pStmt.close();
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
