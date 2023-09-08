import java.io.*;

class Launchio3 {
    public static void main(String[] args) throws Exception {
        int dirCount = 0;
        int jpgFileCount = 0;
        int txtFileCount = 0;
        int zipFileCount = 0;
        String loc = "C:\\Users\\bodda\\Desktop\\javaClasses\\classNotes";
        File f = new File(loc);

        String[] names = f.list();
        int count = 0;

        for(String name: names) {
            count++;
            //creating a file object for f -> (directory)
            File f1 = new File(f,name);
            if (f1.isDirectory())
                dirCount++;
            if(f1.isFile()){
                if (name.endsWith(".png"))
                    jpgFileCount++;
                if(name.endsWith(".txt"))
                    txtFileCount++;
                if(name.endsWith(".zip"))
                    zipFileCount++;
        }
        System.out.println(name);
    }
    System.out.println("Total no of JPGfiles is :: "+jpgFileCount);
    System.out.println("Total no of txtfiles is :: "+txtFileCount);
    System.out.println("Total no of Zipfiles is :: "+zipFileCount);
    System.out.println("Total no of Directory is :: "+dirCount);
    System.out.println("Total no of files is :: " + count);
    }
}
