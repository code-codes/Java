import java.util.*;

public class Generics4 {
    public static void main(String[] args) {
        // (JDK 1.5v)
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sachin");
        // al.add(10); //Results in CTE
        m1(al);

    }

    public static void m1(/* JDK 1.4v */ArrayList al) {
        al.add(10); // dont result in CTE
        al.add("dhoni");
    }
}
