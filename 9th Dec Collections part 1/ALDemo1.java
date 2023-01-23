import java.util.*;

public class ALDemo1
{
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		
		//homogeneous data
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		
		System.out.println(al1);
		
		//heterogeneous data
		al1.add("iNeuron");
		al1.add(14.6);
		al1.add('b');
		
		System.out.println(al1);
		
		//copy contents from one array list to anathor
		ArrayList al2 = new ArrayList();
		al2.addAll(al1);
		System.out.println(al2);
		
		//to add at a particular Index
		al2.add(2, 25);
		
		//to add at front end
		al2.add(0, 5);
		
		//to add at rear
		al2.add(44);
		
		System.out.println(al2);

	}
}
