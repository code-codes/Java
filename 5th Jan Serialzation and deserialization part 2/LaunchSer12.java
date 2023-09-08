//import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Externalizable;
import java.io.ObjectOutput;
import java.io.ObjectInput;

class ExternalizableDemo implements Externalizable{
    String i;
    int j;
    int k;
    ExternalizableDemo(String i,int j,int k){
    this.i=i;
    this.j=j;
    this.k=k;
    }
    public ExternalizableDemo(){
    System.out.println("Zero arg constructor");
    }
    //Performing Serialization as per our requirement
    public void writeExternal(ObjectOutput out) throws IOException{
    System.out.println("call back method used while Serialization");
    out.writeObject(i);
    out.writeInt(j);
    }
    //Performing DeSerialization as per our requirement
    public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{

    System.out.println("call back method used while DeSerialization");
    i=(String)in.readObject();
    j=in.readInt();
    }
}

public class LaunchSer12 {
    public static void main(String[] args)throws IOException,ClassNotFoundException{

    ExternalizableDemo d=new ExternalizableDemo("nitin",100,200);
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
    d=(ExternalizableDemo)ois.readObject();
    ois.close();
    System.out.println(d.i+"======>"+d.j+"======>"+d.k);
    System.out.println("DeSerialization ended");
    }
}

// Output
// Serialization started
// call back method used while Serialization
// Serialization ended
// ******************************
// DeSerialization started
// Zero arg constructor
// call back method used while DeSerialization
// nitin======>100======>0
// DeSerialization ended