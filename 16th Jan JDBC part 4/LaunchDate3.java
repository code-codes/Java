import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LaunchDate3 {
    public static void main(String[] args) throws SQLException, ParseException {
        // Database URL (provide the full path if the database isn't in the project directory)
        String dbUrl = "jdbc:sqlite:testing.db";
        PreparedStatement pstmt = null;
        Scanner scanner = null;

        java.sql.Date sqlDob = null;
        java.sql.Date sqlDom = null;

        String name = null;
        String dob = null;
        String dom = null;

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            System.out.println("Connected to SQLite database!");
            scanner = new Scanner(System.in);
            try {
                String createTableSQL = "CREATE TABLE IF NOT EXISTS testing (\n" +
                        "    name TEXT,\n" +
                        "    dob DATE,\n" +
                        "    dom DATE" +
                        ");";
                pstmt = connection.prepareStatement(createTableSQL);
                pstmt.execute();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            String sqlInsertQuery = "insert into testing(`name`, `dob`, `dom`) values(?, ?, ?)";
            // Create a statement
            try {
                pstmt = connection.prepareStatement(sqlInsertQuery);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            System.out.print("Enter the username :: ");
            name = scanner.next();

            System.out.print("Enter the dob(MM-dd-yyyy) :: ");
            dob = scanner.next();

            System.out.print("Enter the dom(yyyy-MM-dd) :: ");
            dom = scanner.next();

            if(dob != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                java.util.Date udate = sdf.parse(dob);
                System.out.println(udate);

                long value = udate.getTime();
                sqlDob = new java.sql.Date(value);
                System.out.println(sqlDob);

            }
            if(dom != null) {
                sqlDom = java.sql.Date.valueOf(dom);
                System.out.println(sqlDom);
            }
            pstmt.setString(1, name);
            pstmt.setDate(2, sqlDob);
            pstmt.setDate(3, sqlDom);

            int rowAffected = pstmt.executeUpdate();
            System.out.println("No of rows inserted is :: " + rowAffected);


            //To retrieve data from tables:
            String sqlSelectQuery = "select name,dob,dom from testing where name=?";
            try {
                pstmt = connection.prepareStatement(sqlSelectQuery);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            if (pstmt != null) {
                // setting input values
                pstmt.setString(1, name);

                // executing the query
                resultSet = pstmt.executeQuery();
            }

            if (resultSet != null) {
                // processing the resultSet
                if (resultSet.next()) {
                    System.out.println("SNAME\tSDOB\t\tSDOM");
                    String sname = resultSet.getString(1);
                    java.sql.Date sdob = resultSet.getDate(2);
                    java.sql.Date sdom = resultSet.getDate(3);

                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    String strDob = sdf.format(sdob);
                    String strDom = sdf.format(sdom);
                    System.out.println(sname + "\t" + strDob + "\t" + strDom);

                } else {
                    System.out.println("Record not available for the given id :: " + name);
                }

            }
    } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
