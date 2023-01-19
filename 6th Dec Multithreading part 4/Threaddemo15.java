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

public class Threaddemo15
{
	public static void main(String[] args) {
	    
		/*MyRunnable r = new MyRunnable();
		MyThread t = new MyThread(r);
		t.start();
		*/
		
		//using lambda expressions:
// 		Runnable r = new Runnable() {
// 		    @Override
// 		    public void run() {
//                 for(int i = 1; i <= 5; i++) {
//                     System.out.println("child thread");
//                 }
//             }
// 		};
		
		Thread t = new Thread(new Runnable() {
		    @Override
		    public void run() {
                for(int i = 1; i <= 5; i++) {
                    System.out.println("child thread");
                }
            }
		}
            );
		t.start();
		
		for(int i = 1; i <= 5; i++) {
            System.out.println("Main thread");
        }
	}
}


