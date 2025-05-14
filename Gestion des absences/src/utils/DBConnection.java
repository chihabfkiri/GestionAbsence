package src.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public static Connection connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:resources/student.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
