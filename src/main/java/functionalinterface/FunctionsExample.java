package functionalinterface;

import java.util.function.Function;

/**
 * Created by kasia on 30/09/2015.
 */
public class FunctionsExample {

    public static void main(String[] arg) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        System.out.println(backToString.apply("123"));

    }
}
