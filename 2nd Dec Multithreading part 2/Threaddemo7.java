//Mythread <- Thread <- Runnable
class Mythread extends Thread {
    
    @Override
    public void run() {
        System.out.println("No arg run method");
    }
}
public class Threaddemo7
{
	public static void main(String[] args) {
	    
	    Mythread r = new Mythread();
	    // using constructor Thread(Runnable r)
	    Thread t = new Thread(r);
	    t.start();
	    System.out.println("Main thread");
	}
}
