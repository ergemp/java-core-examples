package org.ergemp.jdbc.postgres;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class BYTEASelectExample {
    public static void main(String[] args){
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/postgres";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "pss9769wrd");

            Connection conn = DriverManager.getConnection(url, props);
            Statement stmt = conn.createStatement();

            PreparedStatement pStmt = conn.prepareStatement("SELECT img FROM images WHERE imgname = ?");
            pStmt.setString(1, "ep.jpg");
            ResultSet rs = pStmt.executeQuery();
            while (rs.next())
            {
                byte[] imgBytes = rs.getBytes(1);
                // use the data in some way here

                try (FileOutputStream fos = new FileOutputStream("resources/ep2.jpg")) {
                    fos.write(imgBytes);
                    // fos.close(); There is no more need for this line since you had created the instance of "fos" inside the try.
                    // And this will automatically close the OutputStream
                }
            }
            rs.close();
            pStmt.close();
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
