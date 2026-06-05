package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoDB {

    private static final String DB_URL = "jdbc:sqlite:todos.db";

    public TodoDB() { 
        initSchema();
    }

    private connecton connect() throws SQLExeption {
        return DriverManager.getConnection(DB_URL);
    }

    private void initSchema() {
        String sql = "CREATE TABLE IF NOT EXISTS todos (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "task TEXT NOT NULL) STRICT";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RUntimeExeption("Scheama init failed: " + e.getMessage());
        }
    }
}