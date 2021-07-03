package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class DBConnection {
    private Connection connection;
    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/telefonrehberi", "root", "root");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this.connection;
    }
}
