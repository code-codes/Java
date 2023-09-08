import java.io.*;
class Launchio9 {
    public static void main(String[] args)throws Exception  {
        PrintWriter pw = new PrintWriter("file3.txt");
        //reading from first file and writing to file3.txt
        BufferedReader br= new BufferedReader(new FileReader("file1.txt"));
        String line = br.readLine();
        while (line!=null)  {
            pw.println(line);
            line=br.readLine();
        }
        br.close();
        //reading from second file and writing to file3.txt
        br =new BufferedReader(new FileReader("file2.txt"));
        line = br.readLine();
        while (line!=null)  {
            pw.println(line);
            line=br.readLine();
        }
        //To write all the data to file3.txt
        pw.flush();
        br.close();
        pw.close();
        System.out.println("Open file3.txt to see the result");
    }
//JVM shutdown now
}
