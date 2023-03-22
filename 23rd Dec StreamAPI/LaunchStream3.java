import java.util.*;
import java.util.stream.*;

public class LaunchStream3 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("sachin");
        names.add("saurav");
        names.add("dhoni");
        names.add("dravid");
        names.add("kohli");
        names.add("raina");
        System.out.println(names);
        List<String> reslut = names.stream().filter(name -> name.length() > 5).collect(Collectors.toList());
        System.out.println(reslut.size());
        long count = names.stream().filter(name -> name.length() > 5).count();
        System.out.println("The no of objects whose string length > 5 is ::" + count);
    }
}
