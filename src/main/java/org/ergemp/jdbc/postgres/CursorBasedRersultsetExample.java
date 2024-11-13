package org.ergemp.jdbc.postgres;

import java.sql.*;
import java.util.Properties;

public class CursorBasedRersultsetExample {
    public static void main(String[] args){
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://phadoop01:5432/hive";
            Properties props = new Properties();
            props.setProperty("user", "hadoop");
            props.setProperty("password", "hellori123");

            Connection conn = DriverManager.getConnection(url, props);

            // make sure autocommit is off
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();

            // Turn use of the cursor on.
            stmt.setFetchSize(1);
            ResultSet rs = stmt.executeQuery(" SELECT \"TBL_ID\", \"DB_ID\", \"OWNER\", \"TBL_NAME\", \"TBL_TYPE\" " +
                                                  " FROM \"TBLS\" WHERE lower(\"OWNER\") = 'hadoop'");
            while (rs.next())
            {
                System.out.println("a row was returned.");
            }
            rs.close();

            // Turn the cursor off.
            stmt.setFetchSize(0);
            rs = stmt.executeQuery(" SELECT \"TBL_ID\", \"DB_ID\", \"OWNER\", \"TBL_NAME\", \"TBL_TYPE\" " +
                                        " FROM \"TBLS\" WHERE lower(\"OWNER\") = 'hadoop'");
            while (rs.next())
            {
                System.out.println("many rows were returned.");
            }
            rs.close();

            // Close the statement.
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
