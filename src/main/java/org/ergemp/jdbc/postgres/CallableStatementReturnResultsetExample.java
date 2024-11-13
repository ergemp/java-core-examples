package org.ergemp.jdbc.postgres;

import java.sql.*;
import java.util.Properties;

public class CallableStatementReturnResultsetExample {
    public static void main(String[] args){
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/postgres";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "pss9769wrd");

            Connection conn = DriverManager.getConnection(url, props);
            Statement stmt = conn.createStatement();

            String tableName = "t_test_table01";
            CallableStatement proc = conn.prepareCall(" select * from f_get_table(?) ");
            proc.setString(1, tableName);

            ResultSet rSet = proc.executeQuery();
            while (rSet.next()){
                System.out.println(rSet.getString(1));
            }
        }
        catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
        catch(SQLException sqlex) {
            sqlex.printStackTrace();
        }
        finally{

        }
    }
}
