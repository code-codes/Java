import java.sql.*;


class MyThread extends Thread {
    static Thread mt;
    @Override
    public void run() {
            try {
                mt.join();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            for(int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}



public class Threaddemo12
{
	public static void main(String[] args) throws InterruptedException {
	    
	    MyThread.mt = Thread.currentThread();
		
		MyThread t = new MyThread();
		t.start();
		///*case2*/ t.join(100, 10);
		for(int i = 0; i < 5; i++) {
		    Thread.sleep(2000);
            System.out.println("Main Thread");
        }
	}
}
