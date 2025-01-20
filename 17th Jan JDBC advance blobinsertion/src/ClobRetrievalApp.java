import java.io.*;
import java.sql.*;
import java.util.Scanner;


public class ClobRetrievalApp {
    public static void main(String[] args) {
        String dbUrl = "jdbc:sqlite:clobpersons.db";
        PreparedStatement pstmt = null;

        String personName = null;
        ResultSet resultSet;

        Scanner scanner = new Scanner(System.in);;
        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            System.out.println("Connected to SQLite database!");

            // Prepare insert statement
            String sqlInsertQuery = "SELECT name, history FROM clobpersons WHERE NAME=?";
            pstmt = connection.prepareStatement(sqlInsertQuery);

            if (pstmt != null) {
                // collecting the inputs
                if (scanner != null) {
                    System.out.print("Enter the username :: ");
                    personName = scanner.next();
                }

                pstmt.setString(1, personName);
                resultSet = pstmt.executeQuery();

                if(resultSet != null) {
                    String sname = resultSet.getString(1);
                    Reader reader = resultSet.getCharacterStream(2);

                    File file = new File("clobtxt.txt");
                    FileWriter writer = new FileWriter(file);


                    char[] buffer = new char[1024];
                    int bytesRead;

                    while ((bytesRead = reader.read(buffer)) != -1) {
                        writer.write(buffer, 0, bytesRead);
                    }
                    // copying the data from is to fos, works with the package
                    //IOUtils.copy(reader, writer);

                    writer.close();
                    System.out.println(sname + "\t" + file.getAbsolutePath());
                }

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