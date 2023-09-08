import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class Animal implements Serializable{
    int i=10;
}

class Dog extends Animal{
    int j=20;
}

public class LaunchSer10 {
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        Dog d=new Dog();
        System.out.println("Serialization started");
        FileOutputStream fos=new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);
        oos.close();
        System.out.println("Serialization ended");
        System.out.println("******************************");
        System.out.println("DeSerialization started");
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d1=(Dog)ois.readObject();
        ois.close();
        System.out.println(d1.i+"====> "+d1.j);
        System.out.println("DeSerialization ended");
    }
}


// Output
// Serialization started
// Serialization ended
// ******************************
// DeSerialization started
// 10====> 20
// DeSerialization ended