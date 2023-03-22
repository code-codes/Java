import java.util.*;
import java.util.stream.*;
// Comparable(Predefined API for natural sorting order) -> compareTo(Object obj)
// Comparator(for userdefined class for customized sorting order)->compare(Obj1,Obj2)

public class LaunchStream4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        System.out.println("Before sorting :: " + al);
        // using stream api
        List<Integer> resultList =

                al.stream().sorted().collect(Collectors.toList());

        System.out.println("After sorting :: " + resultList);
        List<Integer> customizedResult = al.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());

        System.out.println("After sorting :: " + customizedResult);
    }
}
