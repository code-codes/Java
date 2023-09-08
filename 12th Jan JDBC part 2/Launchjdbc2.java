import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC4.X autoloading feature is enabled.
public class Launchjdbc2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {

    // Step2. Establish the Connection
    String url = "jdbc:mysql:///students";
    String user = "root";
    String password = "Bhavs@2k18";
    Connection connection = DriverManager.getConnection(url, user, password);

    System.out.println("CONNECTION object created...");
    // Step3. Create statement Object and send the Query
    Statement statement = connection.createStatement();
    System.out.println("STATEMENT object created...");
    // Step4. Execute the Query and Process the resultSet
    String sqlSelectQuery = "select id,name,age,year from student";
    ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
    System.out.println("RESULTSET object created...");
    System.out.println("SID\tSNAME\tSAGE\tSYEAR");
    while (resultSet.next()) {
        int sid = resultSet.getInt("id");
        String sname = resultSet.getString("name");

        int sage = resultSet.getInt("age");
        String saddress = resultSet.getString("year");
        System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + saddress);
    }
    // Step6. Close the resources
    resultSet.close();
    statement.close();
    connection.close();
    System.out.println("Closing the resources...");
}
}