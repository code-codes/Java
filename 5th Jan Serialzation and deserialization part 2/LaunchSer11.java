import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class Animal {
    int i=10;
    Animal(){
    System.out.println("No arg Animal constructor");
    }
}

class Dog extends Animal implements Serializable{
    int j=20;
    Dog(){
    System.out.println("No arg Dog constructor");
    }
}
public class LaunchSer11 {
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        Dog d=new Dog();
        d.i=888;
        d.j=999;
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
// No arg Animal constructor
// No arg Dog constructor
// Serialization started
// Serialization ended
// ******************************
// DeSerialization started
// No arg Animal constructor
// 10====> 999
// DeSerialization ended
