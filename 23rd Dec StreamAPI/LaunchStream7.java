
//This method collects the elements from the stream and adding to the specified to the collection indicated (specified) by argument.

import java.util.*;
import java.util.stream.*;

public class LaunchStream7 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("sachin");
        names.add("saurav");
        names.add("dhoni");

        names.add("yuvi");
        System.out.println(names);// [sachin,saurav,dhoni,yuvi]

        // Predicate(I)
        // public abstract boolean test(T);

        List<String> result = names.stream().filter(name -> name.length() > 5).collect(Collectors.toList());
        System.out.println(result);

        // Function(I)<T,R>
        // public abstract R apply(T);

        List<String> mapResult = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());

        System.out.println(mapResult);

    }
}
