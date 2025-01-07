import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LaunchDate2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String sdate = sc.next();

        //convert the string to java.util.date
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date udate = sdf.parse(sdate);

        //convert java.util.date to java.sql.date
        long value = udate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(value);

        System.out.println(sdate);
        System.out.println(udate);
        System.out.println(sqlDate);

        //if the user have entered date in this format, then we can convert it easily to sql date
        //so, if we restrict this data format in frontend side, then the above steps are not necessary
        System.out.println("Enter date in yyyy-MM-dd format");
        String standardInput = sc.next();
        java.sql.Date s2date = java.sql.Date.valueOf(standardInput);
        System.out.println(s2date);

        sc.close();
    }   
}
