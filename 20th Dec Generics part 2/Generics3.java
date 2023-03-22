import java.util.*;
public class Generics3
{
	public static void main(String[] args) {
		ArrayList<? super Number> l1= new ArrayList<Number>(); //valid
		ArrayList<? super Number> l2= new ArrayList<Object>(); //valid
		ArrayList<? super Number> l3= new ArrayList<Integer>(); //invalid (only number type or its parent)
		
	}
}
