import java.util.function.*;

// class MyPredicate implements Predicate<Integer> {
//     @Override
//     public boolean test(Integer i) {
//         if (i > 10)
//             return true;
//         else
//             return false;

//     }
// }
// Instead of writing a function, we can simply write a lambda expression

class LaunchPredicate1 {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i > 10;
        System.out.println(p.test(10));// false
        System.out.println(p.test(100));// true
    }
}