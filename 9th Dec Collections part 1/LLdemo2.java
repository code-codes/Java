import java.util.*;

public class LLdemo2 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();

        // homogeneous data
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(40);
        ll1.add(40);

        System.out.println(ll1);

        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        System.out.println(ll1.indexOf(40));
        System.out.println(ll1.indexOf(50));
        System.out.println(ll1.lastIndexOf(40));

        // optional to add
        ll1.offerFirst(5);
        ll1.offerLast(50);

        // compulsory to add
        ll1.addFirst(0);
        ll1.addLast(60);

        ll1.peekFirst();
        System.out.println(ll1);

        ll1.pollFirst();
        System.out.println(ll1);

    }
}
