import java.util.*;
import java.util.stream.*;

public class LaunchStream2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        System.out.println(al);
        // till JDK1.7V
        ArrayList<Integer> doubleList = new ArrayList<Integer>();
        for (Integer i1 : al)
            doubleList.add(i1 * 2);
        System.out.println(doubleList);
        // from JDK1.8V
        // map-> for every object, if a new object has to be created then go for Map

        List<Integer> streamList = al.stream().map(obj -> obj * 2).collect(Collectors.toList());

        System.out.println(streamList);
        streamList.forEach(i -> System.out.println(i));
        System.out.println();
        streamList.forEach(System.out::println);

    }
}
