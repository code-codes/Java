class ThreadB extends Thread {
    
    int total =0;
    
    @Override
    public void run(){
        
        synchronized(this) {
            System.out.println("Child Thread started calculation");
        for (int i=0;i<=100 ; i++){
            total+=i;
        }
        System.out.println("child thread giving notification call");
        this.notify();
        }
    }
}

public class Threaddemo21
{
	public static void main(String[] args) throws InterruptedException{
		ThreadB b=new ThreadB();
        b.start();
        
        synchronized(b) {
            System.out.println("main method calling wait() method");
            b.wait();
            System.out.println("main method got notification call");
            System.out.println(b.total);
        }
	}
}
