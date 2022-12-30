class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("No arg run method");
        run(5);
    }
    
    public void run(int i) {
        System.out.println("One arg run method");
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    MyThread t = new MyThread();
	    t.start();
	    t.run(5);
	    for(int i = 1; i <= 10; i++) {
            System.out.println("Main thread");
        }
	}
}
