import java.util.*;

public class LaunchStream9 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("AAA");
        names.add("BBB");
        names.add("CCC");
        names.add("DDD");
        names.stream().forEach(name -> System.out.println(name));
        names.stream().forEach(System.out::println);

    }
}
