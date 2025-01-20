import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Scanner;


public class ImageRetrievalApp {
    public static void main(String[] args) {
        String dbUrl = "jdbc:sqlite:blobpersons.db";
        PreparedStatement pstmt = null;

        String personName = null;
        ResultSet resultSet;

        Scanner scanner = new Scanner(System.in);;
        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            System.out.println("Connected to SQLite database!");

            // Prepare insert statement
            String sqlInsertQuery = "SELECT name, image FROM blobpersons WHERE NAME=?";
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
                    InputStream is = resultSet.getBinaryStream(2);
                    System.out.println(is);

                    File file = new File("copied.jpg");
                    FileOutputStream fo = new FileOutputStream(new File("copied.jpg"));
//                    int i = is.read();
//                    while(i != -1) {
//                        fo.write(i);
//                        i = is.read();
//                    }
//                    fo.close();
                    //other method
                    byte[] b = new byte[1024];
                    //read some number of bytes from input stream and store into buffer array b
                    //if length of b is 0, then no bytes are read nnd is returned 0
                    while(is.read(b) > 0) {
                        fo.write(b);
                    }

//                    short method which requires jar: io-commons (Apache commons IO 2.8.0)
//                    IOUtils.copy(is, fo);

                    fo.close();
                    System.out.println(sname + " " + file.getAbsoluteFile());
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