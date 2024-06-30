package com.Anudip;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/parth";

        // Database credentials
        String username = "root";
        String password = "parth@7";

        // Establish the connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database.");

            // perform database operations here
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}