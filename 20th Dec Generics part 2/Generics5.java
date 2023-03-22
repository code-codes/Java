import java.util.*;

public class Generics5 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList<String>();
        ArrayList l2 = new ArrayList<Integer>();
        ArrayList l3 = new ArrayList<Double>();
        // these declarations are equal to
        ArrayList l4 = new ArrayList();

        ArrayList l = new ArrayList<String>();
        l.add(10);
        l.add(10.5);
        l.add(true);
        System.out.println(l);// [10, 10.5, true]

        //same as generic
        ArrayList<String> l5 = new ArrayList();
        ArrayList<String> l6 = new ArrayList<> ();
        ArrayList<String> l6 = new ArrayList<String>();
    }
}
