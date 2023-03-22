import java.util.stream.*;

public class LaunchStream6 {
    public static void main(String[] args) {

        // Stream API ===> Collections(group of objects)
        Stream s = Stream.of(9, 99, 999, 9999, 99999);
        s.forEach(System.out::println);
        System.out.println();


        Double[] d = { 10.0, 10.1, 10.2, 10.3, 10.4 };
        Stream s1 = Stream.of(d);
        s1.forEach(System.out::println);
        
    }
}
