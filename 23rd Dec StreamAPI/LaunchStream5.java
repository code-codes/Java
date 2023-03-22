import java.util.*;
// Comparable(Predefined API for natural sorting order) -> compareTo(Object obj)
// Comparator(for userdefined class for customized sorting order)->compare(Obj1,Obj2)

public class LaunchStream5 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        System.out.println("Array List is ::" + al);
        Object[] objArr = al.stream().toArray();
        for (Object obj : objArr)
            System.out.println(obj);
        System.out.println();
        Integer[] objArr1 = al.stream().toArray(Integer[]::new);
        for (Integer obj1 : objArr1)
            System.out.println(obj1);

    }
}
