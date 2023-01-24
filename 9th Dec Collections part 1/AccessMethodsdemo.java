import java.util.*;

public class AccessMethodsdemo.java {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		
		//homogeneous data
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		
		for(int i = 0; i < al1.size(); i++) {
		    System.out.println(al1.get(i));
		}
		
		for(Object o: al1) {
		    System.out.println(o);
		}
		
		Iterator itr = al1.iterator();
		
		while(itr.hasNext()) {
		    System.out.println(itr.next());
		}
		
		ListIterator itr1 = al1.listIterator(al1.size());
		
		while(itr1.hasPrevious()) {
		    System.out.println(itr1.previous());
		}
		
		
		//for arraydeque
		
		ArrayDeque ad1 = new ArrayDeque();
        ad1.add(10);
        ad1.add(20);
        ad1.add(30);
        ad1.add(30);
        System.out.println(ad1);
        ad1.addFirst(5);
        ad1.addLast(10);
        
        Iterator itr3 = ad1.iterator();
        
        while(itr3.hasNext()) {
            System.out.println(itr3.next());
        }
		
		

	}

}
