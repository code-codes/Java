import java.io.*;
import java.util.*;


class LaunchProperties
{
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("application.properties");
        Properties properties = new Properties();
        properties.load(fis);
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("URL IS ::"+url);
        System.out.println("USER IS ::"+user);
        System.out.println("PWD IS ::"+password);
    }
}