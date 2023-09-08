import java.io.*;
/*
public java.io.ObjectOutputStream(java.io.OutputStream) throws
java.io.IOException;
public java.io.FileOutputStream(java.lang.String) throws
java.io.FileNotFoundException;
public final void writeObject(java.lang.Object) throws java.io.IOException;
public java.io.ObjectInputStream(java.io.InputStream) throws java.io.IOException;
public java.io.FileInputStream(java.lang.String) throws
java.io.FileNotFoundException;
public final java.lang.Object readObject() throws java.io.IOException,
java.lang.ClassNotFoundException;
*/
class Account implements Serializable   {
    String userName = "sachin";
    transient String password = "tendulkar";//loss of information
    transient int pin=4444;//loss of information

    //Write a logic of Serialization
    private void writeObject(ObjectOutputStream oos) throws Exception   {
    System.out.println("writeObject method is called....");
    // perform default serialization
    oos.defaultWriteObject();
    // perform encryption on password
    String encypwd = "123" + password;// 123tendulkar
    int encypin = 1111 + pin;// 5555
    // write the encrytped data as object to serialized file
    oos.writeObject(encypwd);
    oos.writeInt(encypin);
    }

    //Write a logic of Deserialization
    private void readObject(ObjectInputStream ois) throws Exception{
    System.out.println("readObject method is called....");
    //perform default deserialization
    ois.defaultReadObject();
    //read encrypted data from serialized file
    String encypwd = (String)ois.readObject();
    int encypin = ois.readInt();

    // perform decryption and attach it to instance variable
    password = encypwd.substring(3);// tendulkar
    pin = encypin - 1111;// 4444
    }
}
class LaunchSer9    {
    public static void main(String[] args)throws Exception  {

        Account account =new Account();
        System.out.println("Serialization started.....");
        String fileName = "abc.ser";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);
        System.out.println("Serialization ended.....");
        //To pause the execution till we press some key from keyboard
        System.in.read();
        System.out.println("De-Serialization started.....");
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account acc=(Account)ois.readObject();
        System.out.println("Username is :: "+acc.userName);
        System.out.println("Password is :: "+acc.password);
        System.out.println("Pin is :: "+acc.pin);
        System.out.println("De-Serialization ended.....");

    }
//JVM shutdown now
}


// Output
// D:\IOOperations>javac Test.java
// D:\IOOperations>java Test
// Serialization started.....
// writeObject method is called....
// Serialization ended.....
// De-Serialization started.....
// readObject method is called....
// Username is :: sachin
// Password is :: tendulkar
// Pin is :: 4444
// De-Serialization ended.....