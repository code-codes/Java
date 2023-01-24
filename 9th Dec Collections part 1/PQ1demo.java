import java.util.*;

public class PQ1demo {
    public static void main(String[] args) {
        PriorityQueue pq1 = new PriorityQueue();
        pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.add(30);
        //duplicates are allowed
        System.out.println(pq1);
        
        System.out.println(pq1.peek());
        System.out.println(pq1.poll());
        
        System.out.println(pq1);
    }

}
