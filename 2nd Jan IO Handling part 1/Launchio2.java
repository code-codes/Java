import java.io.*;

//java.io classes are built using the standards of Unix os
//In linux/unix os there is no diff b/w file and directory
public class Launchio2 {
    public static void main(String[] args)throws IOException    { 
    
    //it treats as a directory as there is not extension in string
    File f=new File("IPLTeams");
    System.out.println(f.exists());//false
    
    
    f.mkdir();//Creates a new directory
    System.out.println(f.exists());//true
    System.out.println("Is f poiting to a file :: " + f.isDirectory());

    File f1 = new File(f, "abc.txt");
    f1.createNewFile();
    System.out.println("Is f1 pointing to a file :: " + f1.isFile());
    }
}

