package org.ergemp.jdbc.postgres;

import java.sql.*;
import java.util.Properties;

public class CallableStatementReturnIntegerExample {
    public static void main(String[] args){
        try{
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/postgres";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "pss9769wrd");

            Connection conn = DriverManager.getConnection(url, props);
            Statement stmt = conn.createStatement();

            String tableName = "t_test_table01";
            CallableStatement proc = conn.prepareCall("{ ? = call f_count_table(?) }");

            proc.registerOutParameter(1, Types.INTEGER);
            proc.setString(2, tableName);

            proc.execute();

            System.out.println(proc.getInt(1));
            proc.close();
            conn.close();
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
