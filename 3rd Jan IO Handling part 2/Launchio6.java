import java.io.*;
/*
public void newLine() throws java.io.IOException;
*/
class Launchio6 {
    public static void main(String[] args)throws Exception  {
        FileWriter fw = new FileWriter("abc.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(105);
        bw.write("Neuron");
        bw.newLine();
        char[] ch ={'P','W','S','K','I','L','L','S'};
        bw.write(ch);
        bw.newLine();
        bw.write("unicorn");

        bw.flush();//to make sure the operation is succesfull on file
        bw.close();//internally fw.close() call will happen
    }
//JVM shutdown now
}
