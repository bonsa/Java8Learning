package functionalinterface;

import java.util.Comparator;

/**
 * Created by kasia on 20/03/2016.
 */
public class ComparatorExample {
    public static void main(String[] arg) {
        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");

        System.out.println(comparator.compare(p1, p2));
        System.out.println(comparator.reversed().compare(p1, p2));

    }
}
