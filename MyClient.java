import java.io.*;  
import java.net.*;  


public class MyClient {  
    public static void main(String[] args) {  
        try{      
            Socket s=new Socket("localhost",6666);  
            DataOutputStream d=new DataOutputStream(s.getOutputStream());  
            d.writeUTF("Hello Server");  
            d.flush();  
            d.close();  
            s.close();  
        }
        
        catch(Exception e){
            System.out.println(e);
        }  
}  
} 