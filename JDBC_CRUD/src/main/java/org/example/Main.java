package org.example;

import java.sql.*;

public class Main {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/practicetaskdb",
                    "root",
                    "123456"
            );

            System.out.println("Database Connected Successfully");
            return con;

        } catch (Exception e) {
            System.out.println("Database Connection Error");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

        Connection con = getConnection();

        if (con != null) {
            System.out.println("Connection Successful");

            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}