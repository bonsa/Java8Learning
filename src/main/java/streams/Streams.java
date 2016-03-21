package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by kasia on 21/03/2016.
 */
public class Streams {
    public static void main(String[] arg) {

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        // Filter
        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        // "aaa1", "aaa2"


        // Sorted
        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        System.out.println(stringCollection);
        // ddd2, aaa2, bbb1, aaa1, bbb3, ccc, bbb2, ddd1

        // Map
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a,b) -> b.compareTo(a))
                .forEach(System.out::println);

        // Match
        boolean anyStartWithA =
                stringCollection
                .stream()
                .anyMatch((s -> s.startsWith("a")));

        System.out.println(anyStartWithA);  // true

        boolean allStartWithA =
                stringCollection
                .stream()
                .allMatch((s) -> s.startsWith("a"));

        System.out.println(allStartWithA);  // false

        boolean noneStartWithZ =
                stringCollection
                .stream()
                .noneMatch((s) -> s.startsWith("z"));

        System.out.println(noneStartWithZ); // true

        // Count
        long startWithB =
            stringCollection
                .stream()
                .filter((s) -> s.startsWith("b"))
                .count();

        System.out.println(startWithB); // 3


        // Reduce
        Optional<String> reduced =
                stringCollection
                .stream()
                .sorted()
                .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
    }
}
