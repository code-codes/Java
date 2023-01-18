import java.sql.*;


class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
		Thread.yield();
        }
    }
}



public class Threaddemo10
{
	public static void main(String[] args) {
		
		//System.out.println("Main Thread priority: " + Thread.currentThread().getPriority());
		MyThread t = new MyThread();
		t.start();
		
		for(int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
	}
}
