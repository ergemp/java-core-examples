package org.ergemp.jdbc.postgres;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class BYTEAInsertExample {
    //CREATE TABLE images (imgname text, img bytea);
    public static void main(String[] args){
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/postgres";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "pss9769wrd");

            Connection conn = DriverManager.getConnection(url, props);
            Statement stmt = conn.createStatement();

            File file = new File("resources/ep.jpg");
            FileInputStream fis = new FileInputStream(file);

            PreparedStatement pStmt = conn.prepareStatement("insert into images values (?, ?)");
            pStmt.setString(1, file.getName());
            pStmt.setBinaryStream(2, fis, (int)file.length());
            pStmt.executeUpdate();

            pStmt.close();
            fis.close();
        }
        catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
        catch(SQLException sqlex) {
            sqlex.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{

        }
    }
}
