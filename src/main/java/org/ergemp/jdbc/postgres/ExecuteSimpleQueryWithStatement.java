package org.ergemp.jdbc.postgres;

import java.sql.*;
import java.util.Properties;

public class ExecuteSimpleQueryWithStatement {
    public static void main(String[] args){

        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://phadoop01:5432/hive";
            Properties props = new Properties();
            props.setProperty("user", "hadoop");
            props.setProperty("password", "hellori123");

            Connection conn = DriverManager.getConnection(url, props);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(" SELECT \"TBL_ID\", \"DB_ID\", \"OWNER\", \"TBL_NAME\", \"TBL_TYPE\" " +
                                                  " FROM \"TBLS\" WHERE lower(\"OWNER\") = 'hadoop'");

            while (rs.next()) {
                System.out.print("Column 4 returned ");
                System.out.println(rs.getString(4));
            }
            rs.close();
            stmt.close();
        }
        catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{

        }
    }
}
