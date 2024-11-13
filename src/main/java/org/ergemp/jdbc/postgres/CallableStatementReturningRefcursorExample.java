package org.ergemp.jdbc.postgres;

import java.sql.*;
import java.util.Properties;

public class CallableStatementReturningRefcursorExample {
    public static void main(String[] args){
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/postgres";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "pss9769wrd");

            Connection conn = DriverManager.getConnection(url, props);
            Statement stmt = conn.createStatement();

            CallableStatement proc = conn.prepareCall("{ ? = call f_get_table4 }");
            proc.registerOutParameter(1, Types.OTHER);

            proc.execute();
            ResultSet rSet = (ResultSet) proc.getObject(1);

            while (rSet.next()){
                System.out.println(rSet.getString(1));
            }
            rSet.close();
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
