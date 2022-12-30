class MyThread extends Thread {
    @Override
    public void start() {
      System.out.println("start method");
    }
    @Override
    public void run() {
        System.out.println("No arg run method");
    }
}
public class Threaddemo3
{
	public static void main(String[] args) {
	    MyThread t = new MyThread();
	    t.start();
	    System.out.println("Main thread");
	}
}

