import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ClobInsertionApp {
    public static void main(String[] args) {
        String dbUrl = "jdbc:sqlite:clobpersons.db";
        PreparedStatement pstmt = null;
        Scanner scanner = null;

        String name = null;
        String pdfLoc = null;

        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            System.out.println("Connected to SQLite database!");

            // Create table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS clobpersons (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "history TEXT" +
                    ")";
            pstmt = connection.prepareStatement(createTableSQL);
            pstmt.execute();

            // Prepare insert statement
            String sqlInsertQuery = "INSERT INTO clobpersons(name, history) VALUES(?, ?)";
            pstmt = connection.prepareStatement(sqlInsertQuery);

            if (pstmt != null) {
                scanner = new Scanner(System.in);
                // collecting the inputs
                if (scanner != null) {
                    System.out.print("Enter the username :: ");
                    name = scanner.next();

                    System.out.print("Enter the pdf location :: ");
                    pdfLoc = scanner.next();
                }

                // Set the input values to Query (This should work in mysql)
                //pstmt.setString(1, name);
                //pstmt.setCharacterStream(2, new FileReader(new File(pdfLoc)));

                // Read file into byte array
                File file = new File(pdfLoc);
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