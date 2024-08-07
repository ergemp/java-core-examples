package org.ergemp.dateTime;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;

//https://mkyong.com/java/how-to-get-current-timestamps-in-java/
public class InsertTimestampIntoTableJdbc {

    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/test", "postgres", "password");
             PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT)) {

            preparedStatement.setString(1, "mkyong");
            preparedStatement.setBigDecimal(2, new BigDecimal("799.88"));
            preparedStatement.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            // preparedStatement.setTimestamp(3, Timestamp.from(ZonedDateTime.now().toInstant()));
            // preparedStatement.setTimestamp(3, Timestamp.from(Instant.now()));

            int row = preparedStatement.executeUpdate();

            // rows affected
            System.out.println(row); //1

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
