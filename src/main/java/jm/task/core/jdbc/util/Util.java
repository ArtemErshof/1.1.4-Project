package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class Util {
    private final static String URL = "jdbc:mysql://localhost:3306/new_schema";
    private final static String USER = "root";
    private final static String PASSWORD = "";
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Соединение успешно.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Соединение не установленно.");
        }
        return connection;
    }
}



