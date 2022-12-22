public class Main {

	public static void main(String[] args) 
	{
		try {
		    System.out.println("Outer try");
		    Integer c = 10;
		    Integer d = 0;
		    c = c/d;
		    try {
		        System.out.println("inner try");
		    }
		    catch(ArithmeticException e) {
		        System.out.print("inner catch");
		    }
		    finally {
		        System.out.print("inner finally");
		    }
		    System.out.print("inner continue");
		}
		catch(NullPointerException e) {
		        System.out.print("outer catch");
		 }
		 finally {
		     System.out.print("outer finally");
		 }
		 System.out.print("outer continue");

	}

}
