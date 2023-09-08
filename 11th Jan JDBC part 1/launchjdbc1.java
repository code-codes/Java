import java.sql.*;

class launchjdbc1 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            
            //Step1. Load and register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully....");
            
            //Step2. Establish the Connection with database
            String url = "jdbc:mysql://localhost:3306/students";
            //username and password would vary from user to user
            String userName = "root";
            String passWord = "Bhavs@2k18";
            connection = DriverManager.getConnection(url,userName,passWord);
            System.out.println("connection established succesfully...");
            System.out.println("The implement class name is "+
            connection.getClass().getName());
            //Step3. Create statement Object and send the query
            String sqlSelectQuery = "select id,name,age,year from student";

            statement = connection.createStatement();
            System.out.println("The implementation class name is ::"+statement.getClass().getName());

            resultSet =statement.executeQuery(sqlSelectQuery);
            System.out.println("The implementation class name is ::"+resultSet.getClass().getName());
            System.out.println();
            System.out.println("ID\tNAME\tAGE\tYEAR");
            //Step4. Process the resultSet
            while (resultSet.next())
            {
            Integer sid = resultSet.getInt(1);
            String sname = resultSet.getString(2);
            Integer sage = resultSet.getInt(3);
            Integer syear = resultSet.getInt(4);
            System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+syear);
        }
        }
        catch (ClassNotFoundException ce){
            ce.printStackTrace();
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
        //closing the resources
            if (connection!=null)   {
            try {
                connection.close();
                System.out.println("Connection closed...");
            }
            catch (SQLException se){

            se.printStackTrace();
            }
        }
        }
    }
}