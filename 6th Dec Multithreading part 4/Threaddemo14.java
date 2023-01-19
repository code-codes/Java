import java.sql.*;

/*
*functionalInterface
interface Runnable {
    void run() {
        
    }
}
*/

/*
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("child thread");
        }
    }
}
*/

public class Main
{
	public static void main(String[] args) {
	    
		/*MyRunnable r = new MyRunnable();
		MyThread t = new MyThread(r);
		t.start();
		*/
		
		//using lambda expressions:
		Runnable r = () -> {
		    for(int i = 1; i <= 5; i++) {
            System.out.println("child thread");
        }
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 1; i <= 5; i++) {
            System.out.println("Main thread");
        }
	}
}


// total no of . class files are only 1
