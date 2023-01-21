class A {
    public void d1(B b) {
        System.out.println("Thread-1 starts execution of d1()");
        try {
            Thread.sleep(5000);// 5sec
        } catch (InterruptedException e) {
        }
        System.out.println("Thread-1 trying to call b last()");
        b.last();
    }

    public void last() {
        System.out.println("Inside A last() method");
    }
}

class B {
    public void d2(A a) {
        System.out.println("Thread-2 starts execution of d2()");
        try {
            Thread.sleep(5000);// 5sec
        } catch (InterruptedException e) {
        }
        System.out.println("Thread-2 trying to call A last()");
        a.last();
    }

    public void last() {
        System.out.println("Inside B last() method");
    }
}

public class Threaddemo23 extends Thread {
    A a = new A();
    B b = new B();

    public void m1() {
        this.start();
        a.d1(b);// executed by main thread
    }

    public void run() {
        b.d2(a);// executed by child thread
    }

    public static void main(String[] args) {
        Threaddemo23 t = new Threaddemo23();
        t.m1();

    }
}

// output:
// Thread-1 starts execution of d1()
// Thread-2 starts execution of d2()
// Thread-1 trying to call b last()
// Thread-2 trying to call A last()
// Inside B last() method
// Inside A last() method