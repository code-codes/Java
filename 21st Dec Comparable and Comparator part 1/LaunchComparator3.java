
//Write a Program to Insert String Objects into the TreeSet
//where the Sorting Order is of Reverse of Alphabetical Order:
import java.util.*;

class LaunchComparator3 {
    public static void main(String[] args) {

        TreeSet t = new TreeSet(new MyComparator());
        t.add("sachin");
        t.add("ponting");
        t.add("sangakara");
        t.add("fleming");
        t.add("lara");
        System.out.println(t);

    }
}

class MyComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = (String) obj2;
        return s2.compareTo(s1);
        // return -s1.compareTo(s2);

    }
}
