import java.util.*;

public class LaunchStream8 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(0);
        al.add(5);
        al.add(25);
        al.add(15);
        System.out.println(al);
        Integer minValue = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();

        System.out.println(minValue);
        Integer maxValue = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();

        System.out.println(maxValue);

    }
}
