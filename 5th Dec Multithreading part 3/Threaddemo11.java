import java.sql.*;


class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e) {
                
            }
        }
    }
}



public class Threaddemo11
{
	public static void main(String[] args) throws InterruptedException {
		
		//System.out.println("Main Thread priority: " + Thread.currentThread().getPriority());
		MyThread t = new MyThread();
		t.start();
		/*case1*/ t.join();
		/*case2*/ t.join(1000);
		for(int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
	}
}
