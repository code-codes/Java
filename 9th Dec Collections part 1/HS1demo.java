import java.util.*;

public class HS1demo {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        hs1.add(100);
        hs1.add(50);
        hs1.add(50);
        hs1.add(150);
        hs1.add(25);
        hs1.add(125);
        //duplicates are not allowed
        //order is not preserved
        System.out.println(hs1);
        
        LinkedHashSet ls1 = new LinkedHashSet();
        ls1.add(100);
        ls1.add(50);
        ls1.add(50);
        ls1.add(150);
        ls1.add(25);
        ls1.add(125);
        //duplicates are not allowed
        //order is preserved
        System.out.println(ls1);
    }

}
