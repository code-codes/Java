import java.util.*;

public class Generics6 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList<String>();
        ArrayList l2 = new ArrayList<Integer>();
        ArrayList l3 = new ArrayList<Double>();
        // these declarations are equal to
        ArrayList l = new ArrayList();
    }
}
