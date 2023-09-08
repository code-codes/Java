import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;

import java.io.ObjectInputStream;
import java.io.Serializable;

class Dog implements Serializable{
    int i=10;
    transient int j=20;
}

public class LaunchSer3 {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        Dog d1=new Dog();
        System.out.println("serialization started");
        FileOutputStream fos= new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.close();
        System.out.println("Serialization ended");
        System.out.println("Deserialization started");
        FileInputStream fis=new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d2=(Dog) ois.readObject();
        ois.close();
        System.out.println("Deserialization ended");
        System.out.println("Dog object data");
        System.out.println(d2.i+"\t" +d2.j);
    }
}

// Output
// serialization started
// Serialization ended
// Deserialization started
// Deserialization ended
// Dog object data
// 10 0