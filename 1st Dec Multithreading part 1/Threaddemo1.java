class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("child Thread");
        }
    }
}
public class Threaddemo1
{
	public static void main(String[] args) {
	    MyThread t = new MyThread();
	    t.start();
	    for(int i = 1; i <= 10; i++) {
            System.out.println("Main thread");
        }
	}
}
