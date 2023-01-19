import java.sql.*;

class Display {
    public synchronized void wish(String name) {
        for(int i = 0; i < 5; i++) {
            System.out.print("Good evening: ");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
            }
            System.out.println(name);
        }
    }
}


class MyThread extends Thread {
    Display d;
    String name;
    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }
    @Override
    public void run() {
        d.wish(name);
    }
}



public class Threaddemo16
{
	public static void main(String[] args) {
	    Display d = new Display();
	    MyThread t1 = new MyThread(d, "sachin");
	    MyThread t2 = new MyThread(d, "dhoni");
	    t1.start();
	    t2.start();
	}
}
