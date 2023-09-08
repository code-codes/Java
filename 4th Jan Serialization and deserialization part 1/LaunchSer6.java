import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
class Dog implements Serializable{
    Cat c=new Cat();
}
class Cat implements Serializable{
    Rat r=new Rat();
}
class Rat implements Serializable{
    int i=10;
}
public class LaunchSer6 {
    public static void main(String[] args)throws IOException,ClassNotFoundException{
        Dog d= new Dog();
        System.out.println("Serialization Started");
        FileOutputStream fos= new FileOutputStream("abc.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(d);
        oos.close();
        System.out.println("Serialization ended");
        System.out.println("***********************************");
        System.out.println("DeSerialization Started");
        FileInputStream fis= new FileInputStream("abc.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Dog d1=(Dog)ois.readObject();
        System.out.println(d1.c.r.i);
        ois.close();
        System.out.println("DeSerialization ended");

    }
}


// Output
// ======
// Serialization Started
// Serialization ended
// ***********************************
// DeSerialization Started
// 10
// DeSerialization ended
