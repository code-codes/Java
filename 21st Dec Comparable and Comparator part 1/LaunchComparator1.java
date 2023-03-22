import java.util.*;
class LaunchComparator1 {
    public static void main(String[] args) {

        TreeSet t1 = new TreeSet();//line-1
        t1.add(10);
        t1.add(0);
        t1.add(15);
        t1.add(5);
        t1.add(20);
        t1.add(20);
        System.out.println(t1);//[0, 5, 10, 15, 20]

        TreeSet t = new TreeSet(new MyComparator());// line-2
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);// [20, 15, 10, 5, 0]

    }
}
class MyComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {

        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;

        // return i1.compareTo(i2); - ascending
        //return -i1.compareTo(i2); descending
        //return i2.compareTo(i1);  descending
        // return -i2.compareTo(i1); ascending
        // return +1 - same as insertion order
        //return -1 reverse of insertion order
        //return 0 only first element
        if(i1 < i2)
        return +1;
        else if(i1 > i2)
        return -1;
        else
        return 0;

    }

}