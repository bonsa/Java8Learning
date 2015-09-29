package functionalinterface;

/**
 * Created by kasia on 29/09/2015.
 */
public class Main {

    public static void main(String[] arg) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);

        //Method and constructor references
        Converter<String, Integer> converter2 = Integer::valueOf;
        Integer converted2 = converter2.convert("123");
        System.out.println(converted2);


    }
}
