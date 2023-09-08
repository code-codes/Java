import java.io.FileReader;
import java.io.IOException;

class Launchio5 {
    public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("abc.txt");
    int i=fr.read();
    while(i!=-1){
        System.out.println((char)i);
        i=fr.read();
    }
    }
}
