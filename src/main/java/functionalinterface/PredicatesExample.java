package functionalinterface;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by kasia on 30/09/2015.
 */
public class PredicatesExample {

    public static void main(String[] arg) {
        Predicate<String> predicate = (s) -> s.length() > 0;

        System.out.println(predicate.test("foo"));
        System.out.println(predicate.negate().test("foo"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}