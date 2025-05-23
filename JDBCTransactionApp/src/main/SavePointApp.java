package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import util.JdbcUtil;
import util.JdbcUtilSqlLite;

public class SavePointApp {

    public static void main(String[] args) {

        // Resources used
        Connection connection = null;
        Statement stmt = null;

        try {
            connection = JdbcUtilSqlLite.getJdbcConnection();

            if (connection != null)
                stmt = connection.createStatement();

            System.out.println("Transaction begins.....");
            connection.setAutoCommit(false);

            stmt.executeUpdate("insert into politicians(`name`,`party`) values('MODI','BJP')");
            stmt.executeUpdate("insert into politicians(`name`,`party`) values('KCR','TRS')");
            Savepoint sp = connection.setSavepoint();
            stmt.executeUpdate("insert into politicians(`name`,`party`) values('siddu','BJP')");
            System.out.println("oop's something went wrong during insertion....");
            connection.rollback(sp);
            System.out.println("Operations are rolled back to savepoint....");
            connection.commit();


            System.out.println("Transaction done....");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtilSqlLite.cleanUp(connection, stmt, null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}