import java.io.*;
/*
public void print(xxxx type);
public void println(xxxx type);
*/
class Launchio8 {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("abc.txt");
        PrintWriter out = new PrintWriter(fw);
        out.write(100);//100 unicode value will be written to a file

        out.write('\n');
        out.println(100);//100 only will be written to the file
        out.println(true);
        out.println('c');
        out.println("DenisRitchie");
        out.flush();
        out.close();
    }
//JVM shutdown now
}