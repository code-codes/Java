class MyRunnable implements Runnable {
    
    @Override
    public void run() {
        System.out.println("No arg run method");
    }
}
public class Threaddemo6
{
	public static void main(String[] args) {
	    
	    MyRunnable r = new MyRunnable();
	    
	    Thread t = new Thread(r);
	    t.start();
	    System.out.println("Main thread");
	}
}
