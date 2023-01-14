class Mythread extends Thread {
    
    @Override
    public void run() {
        //System.out.println("No arg run method");
        System.out.println(Thread.currentThread().getName());
        
        for(int i = 0; i < 5; i++) {
	        System.out.println("bye");
	    }
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	    String s = Thread.currentThread().getName();
	    System.out.println(s);
	    
	    
	    Mythread t = new Mythread();
	    t.start();
	    
	    Thread.currentThread().setName("Yash Thread");
	    System.out.println(Thread.currentThread().getName());
	    
	    for(int i = 0; i < 5; i++) {
	        System.out.println("hello");
	    }
	    System.out.println(10/0);
	    for(int i = 0; i < 5; i++) {
	        System.out.println("hello");
	    }
	}
}


/*  output
main
Yash Thread
hello
hello
hello
hello
hello
Thread-0
bye
byeException in thread "Yash Thread" 
bye
bye
bye
java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:30)
*/
