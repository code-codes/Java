import java.util.function.*;

//without using lamda expression
class MyFunction implements Function<String, Integer> {
    @Override
    public Integer apply(String name) {
        return name.length();

    }
}

public class LaunchFunction1 {
    public static void main(String[] args) {
        Function<String, Integer> f = new MyFunction();
        // Function<String, Integer> f = name -> name.length();
        // int output = f.apply("sachin");
        // System.out.println(output);
        int output = f.apply("sachin");
        System.out.println(output);
        System.out.println("sachin".length());
    }
}
