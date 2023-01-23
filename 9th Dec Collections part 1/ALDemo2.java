import java.util.*;

public class ALDemo2 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();

        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);

        System.out.println(al1);

        System.out.println(al1.contains(40));

        System.out.println(al1.indexOf(20));

        System.out.println(al1.isEmpty());

        al1.ensureCapacity(10);

        System.out.println(al1.size());

        al1.trimToSize();

        System.out.println(al1.size());

        System.out.println(al1.getClass());

        al1.clear();

        System.out.println(al1.size());

    }
}



