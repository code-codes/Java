import java.io.*;

class Launchio4 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("abc.txt");
        FileWriter f2 = new FileWriter(f1, true);

        f2.write(97);
        f2.write("\n");
        f2.write("Hello, good morning");
        f2.write("\n");
        char[] ch = {'I', ' ', 'a', 'm', ' ', 'B', 'h', 'a', 'v', 'a', 'n', 'a'};
        f2.write(ch);

        f2.close();
    }    
}
