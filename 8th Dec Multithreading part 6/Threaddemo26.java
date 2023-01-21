import java.io.PrintStream;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("child thread");
            try {
                Thread.sleep(2000);// 2sec
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Threaddemo26 {
    public static void main(String[] args) {
        PrintStream
        MyThread t = new MyThread();
        t.setDaemon(true);// stmt-1
        t.start();
        System.out.println("end of main thread");

    }
}

// output

// end of main thread
// child thread