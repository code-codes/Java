package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtilSqlLite {

    private JdbcUtilSqlLite() {
    }

    public static Connection getJdbcConnection() throws SQLException, IOException {
//        String dbUrl = "jdbc:sqlite:blobpersons.db";
//
//
//        String name = null;
//        String imageLoc = null;
//
//        Connection connection = DriverManager.getConnection(dbUrl)

            // Take the data from properties file
        FileInputStream fis = new FileInputStream("src/properties/application.properties");
        Properties properties = new Properties();
        properties.load(fis);

        // Step2. Establish the Connection
        // For SQLite, we only need the URL
        Connection connection = DriverManager.getConnection(properties.getProperty("sqlurl"));
        createTablesIfNotExist(connection);
        System.out.println("Connected to SQLite database!");
        return connection;
    }

    public static void cleanUp(Connection con, Statement statement, ResultSet resultSet) throws SQLException {
        // Step6. Close the resources
        if (con != null) {
            con.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (resultSet != null) {
            resultSet.close();
        }
    }

    // Optional: Method to create tables if they don't exist
    public static void createTablesIfNotExist(Connection connection) throws SQLException {
        try (Statement stmt = connection.createStatement()) {
            String createTableSQL1 = "CREATE TABLE IF NOT EXISTS accounts (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "balance INTEGER" +
                    ")";

            stmt.execute(createTableSQL1);

            String createTableSQL2 = "CREATE TABLE IF NOT EXISTS politicians (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "party TEXT" +
                    ")";

            stmt.execute(createTableSQL2);

            String createTableSQL3 = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "age INTEGER" +
                    "address TEXT" +
                    ")";

            stmt.execute(createTableSQL3);


            // Insert initial data if table is empty
            ResultSet rs1 = stmt.executeQuery("SELECT COUNT(*) FROM accounts");
            if (rs1.getInt(1) == 0) {
                stmt.executeUpdate("INSERT INTO accounts (name, party) VALUES ('sachin', 10000)");
                stmt.executeUpdate("INSERT INTO accounts (name, party) VALUES ('dhoni', 5000)");
                stmt.executeUpdate("INSERT INTO accounts (name, party) VALUES ('madhavi', 2560)");
            }

            // Insert initial data if table is empty
            ResultSet rs2 = stmt.executeQuery("SELECT COUNT(*) FROM politicians");
            if (rs2.getInt(1) == 0) {
                stmt.executeUpdate("INSERT INTO accounts (name, balance) VALUES ('Modi', 'BJP')");
                stmt.executeUpdate("INSERT INTO accounts (name, balance) VALUES ('Rahul', 'Congress')");
            }

            // Insert initial data if table is empty
            ResultSet rs3 = stmt.executeQuery("SELECT COUNT(*) FROM employees");
            if (rs3.getInt(1) == 0) {
                stmt.executeUpdate("INSERT INTO accounts (name, age, address) VALUES ('sachin', 49, 'MI')");
                stmt.executeUpdate("INSERT INTO accounts (name, age, address) VALUES ('dhoni', 40, 'CSK')");
                stmt.executeUpdate("INSERT INTO accounts (name, age, address) VALUES ('kohli', 35, 'RCB')");
                stmt.executeUpdate("INSERT INTO accounts (name, age, address) VALUES ('Gill', 25, 'GT')");
                stmt.executeUpdate("INSERT INTO accounts (name, age, address) VALUES ('Sky', 32, 'MI')");
                stmt.executeUpdate("INSERT INTO accounts (name, age, address) VALUES ('Jadeja', 36, 'CSK')");
                stmt.executeUpdate("INSERT INTO accounts (name, age, address) VALUES ('Rahul', 34, 'KKR')");


            }
        }
    }
}