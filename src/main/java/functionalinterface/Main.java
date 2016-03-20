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

        Something something = new Something();
        Converter<String, String> converter3 = something::startWith;
        String converted3 = converter3.convert("Java");
        System.out.println(converted3);

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Jan", "Klapa");
        System.out.print(person);
    }
}
