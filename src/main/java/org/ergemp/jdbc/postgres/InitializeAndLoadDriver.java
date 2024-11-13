package org.ergemp.jdbc.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class InitializeAndLoadDriver {
    public static void main(String[] args){

        try {
            Class.forName("org.postgresql.Driver");

            //jdbc:postgresql://host:port/database
            String url = "jdbc:postgresql://10.141.1.181:5432/hive";
            Properties props = new Properties();
            props.setProperty("user","hadoop");
            props.setProperty("password","hellori123");

            //Connection conn = DriverManager.getConnection(url,"hadoop","hellori123");
            Connection conn = DriverManager.getConnection(url, props);

            //String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
            //Connection conn = DriverManager.getConnection(url);
        }
        catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{

        }
    }
}
