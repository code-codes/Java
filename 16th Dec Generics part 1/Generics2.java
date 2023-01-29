import java.util.*;
public class Generics2
{
	public static void main(String[] args) {
	   // <String> --> Type Parameter
	   // List     --> Base parameter
		List<String> al1 = new ArrayList<String>();
		List<String> al2 =new ArrayList<String>();
        Collection<String> al3 =new ArrayList<String>();
        Collection<Object> al4 =new ArrayList<String>();//CE: incompatible types
		
	}
}
