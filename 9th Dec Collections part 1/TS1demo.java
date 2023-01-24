import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet ts1 = new TreeSet();
        ts1.add(100);
        ts1.add(50);
        ts1.add(150);
        ts1.add(25);
        ts1.add(75);
        ts1.add(125);
        ts1.add(175);
        //duplicates are allowed
        System.out.println(ts1);
        
        System.out.println(ts1.ceiling(50));
        System.out.println(ts1.higher(50));
        System.out.println(ts1.floor(50));
        System.out.println(ts1.lower(50));
        
    }

}
