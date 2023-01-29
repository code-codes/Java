import java.util.*;

public class Generics1
{
	public static void main(String[] args) {
	    //Arrays have typesafety
		String[] s = new String[600];
		s[0] = "sachin";
		s[1] = "dhoni";
		
		String s1 = s[0];
		String s2 = s[1]; // Typecasting is nt required
		
		
		//collections do not have typesafety
		ArrayList al = new ArrayList();
		al.add("sachin");
		al.add("dhoni");
		al.add(14); 
		
		String s3 = (String) al.get(2);
	}
}
