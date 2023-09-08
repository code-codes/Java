package LaunchSer13;
import java.io.*;

class Dog implements Serializable {
    private static final long serialVersionUID=1L;
    int i=10;
    int j=20;
}
public class Receiver {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog) ois.readObject();
        System.out.println(d2.i+"=====>"+d2.j);
        ois.close();
    }
}
