import java.io.*;

class Launchio1{
    public static void main(String[] args)throws IOException{
        
        //This line will check if the file "cricket.txt" exists or not
        //if it is available it would point to that file
        //else it will represent a java file object and not a physical file
        File f=new File("cricket.txt");
        System.out.println(f.exists());//false
        
        //It will create a physical file if the file does not exists
        f.createNewFile();
        System.out.println(f.exists());//true
    }
}