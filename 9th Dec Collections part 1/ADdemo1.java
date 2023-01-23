import java.util.*;

public class ADdemo1 {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(10);
        ad1.add(20);
        ad1.add(30);
        ad1.add(30);
        System.out.println(ad1);
        ad1.addFirst(5);
        ad1.addLast(10);

    }

}
