import java.util.*;


public class LLdemo1 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();

        // homogeneous data
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);

        System.out.println(ll1);

        // heterogeneous data
        ll1.add("iNeuron");
        ll1.add(14.6);
        ll1.add('b');

        System.out.println(ll1);

        // copy contents from one Linked list to anathor
        LinkedList ll2 = new LinkedList();
        ll2.addAll(ll1);
        System.out.println(ll2);

        // to add at a particular Index
        ll2.add(2, 25);

        // to add at front end
        ll2.addFirst(5);

        // to add at rear
        ll2.addLast(44);

        System.out.println(ll2);

    }
}
