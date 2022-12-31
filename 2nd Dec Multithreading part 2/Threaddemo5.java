class MyThread extends Thread {
    @Override
    public void start() {
        super.start();
      System.out.println("start method");
    }
    @Override
    public void run() {
        System.out.println("No arg run method");
    }
}
public class Main
{
	public static void main(String[] args) {
	    MyThread t = new MyThread();
	    t.start();
	    System.out.println("Main thread");
	}
}
