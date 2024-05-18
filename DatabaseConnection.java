package daoServices;
import java.sql.*;
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/demo";
    private String user = "root";
    private String password = "Mbisthebest69";

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("NU s-a gasit driverul pentru jdbc!");
            e.printStackTrace();
            throw new SQLException(e);
        }
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    // Optional: Provide a method to close the connection
    public static void closeConnection() {
        if (instance != null && instance.getConnection() != null) {
            try {
                instance.getConnection().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}