import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.*;
import java.util.Scanner;

public class BlobInsertionApp {
    public static void main(String[] args) {
        String dbUrl = "jdbc:sqlite:persons.db";
        PreparedStatement pstmt = null;
        Scanner scanner = null;

        String name = null;
        String imageLoc = null;

        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            System.out.println("Connected to SQLite database!");

            // Create table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS persons (" +
                    "name TEXT," +
                    "image BLOB" +
                    ")";
            pstmt = connection.prepareStatement(createTableSQL);
            pstmt.execute();

            // Prepare insert statement
            String sqlInsertQuery = "INSERT INTO persons(name, image) VALUES(?, ?)";
            pstmt = connection.prepareStatement(sqlInsertQuery);

            if (pstmt != null) {
                scanner = new Scanner(System.in);
                // collecting the inputs
                if (scanner != null) {
                    System.out.print("Enter the username :: ");
                    name = scanner.next();

                    System.out.print("Enter the image location :: ");
                    imageLoc = scanner.next();
                }

                // Set the input values to Query (This should work in mysql)
                //pstmt.setString(1, name);
                //pstmt.setBinaryStream(2, new FileInputStream(new File(imageLoc)));

                // Read file into byte array
                File file = new File(imageLoc);
                byte[] fileContent = Files.readAllBytes(file.toPath());

                // Set the input values to Query
                pstmt.setString(1, name);
                pstmt.setBytes(2, fileContent);  // Using setBytes instead of setBinaryStream

                // execute the query
                int rowAffected = pstmt.executeUpdate();
                System.out.println("No of rows inserted is :: " + rowAffected);
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}