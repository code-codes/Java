import java.sql.*;

// case - 1 - when the child thread enters into waiting/ sleep state, interrupt() call has effect

// class MyThread extends Thread {
//     @Override
//     public void run() {
//         try {
//             for(int i = 0; i < 5; i++) {
//             System.out.println("I am sleeping" + i);
//             Thread.sleep(3000);
//         }
//         } catch(Exception e) {
//             System.out.print("I got interrupted");
//         }
            
//     }
// }



// public class Threaddemo13
// {
// 	public static void main(String[] args) throws InterruptedException {
	    
		
// 		MyThread t = new MyThread();
// 		t.start();
// 		t.interrupt();
// 		System.out.println("Main Thread");
// 	}
// }


// output: 
// Main Thread
// I am sleeping0
// I got interrupted

//****************************************************************************************//

// case 2 - when the child thread doesnt enter into waiting/ sleep state, interrupt() call doesnt have effect

// class MyThread extends Thread {
//     @Override
//     public void run() {
//         try {
//             for(int i = 0; i < 5; i++) {
//             System.out.println("I am sleeping" + i);
//         }
//         } catch(Exception e) {
//             System.out.print("I got interrupted");
//         }
            
//     }
// }



// public class Threaddemo13
// {
// 	public static void main(String[] args) throws InterruptedException {
	    
		
// 		MyThread t = new MyThread();
// 		t.start();
// 		t.interrupt();
// 		System.out.println("Main Thread");
// 	}
// }



// output: 
// Main Thread
// I am sleeping0
// I am sleeping1
// I am sleeping2
// I am sleeping3
// I am sleeping4



//****************************************************************************************

//case 3 - when the child thread enters into waiting/ sleep state after doing his job, interrupt() call have effect

class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("I am sleeping" + i);
        }
        System.out.println("I am now sleeping");
        try {
            Thread.sleep(3000);
        }
        catch(Exception e) {
            System.out.print("I got interrupted");
        }
            
    }
}



public class Threaddemo13
{
	public static void main(String[] args) throws InterruptedException {
	    
		
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("Main Thread");
	}
}



// output:
// Main Thread
// I am sleeping0
// I am sleeping1
// I am sleeping2
// I am sleeping3
// I am sleeping4
// I am sleeping
// I got interrupted
