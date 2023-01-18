//Understanding priority of Threads

import java.sql.*;


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("child Thread priority: " + Thread.currentThread().getPriority());
    }
}



public class Main
{
	public static void main(String[] args) {
		
		System.out.println("Main Thread priority: " + Thread.currentThread().getPriority());
		MyThread t = new MyThread();
		t.start();
	}
}


// OUTPUT:
// Main Thread priority: 5
// child Thread priority: 5
