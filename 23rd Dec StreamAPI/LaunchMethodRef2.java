@FunctionalInterface

interface Interf {
    public void m1(int i);
}

public class LaunchMethodRef2 {
    // logic coded by other developer
    public void m2(int i) {
        System.out.println(i * i);
        System.out.println("logic coming from method reference...");
    }

    public static void main(String[] args) {

        Interf i = x -> System.out.println(x);
        i.m1(10);
        System.out.println();
        // method reference(binding the body of m2() to abstract method m1)

        Interf i1 = new LaunchMethodRef2()::m2;
        i1.m1(20);

    }
}