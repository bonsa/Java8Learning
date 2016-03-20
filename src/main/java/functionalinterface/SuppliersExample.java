package functionalinterface;

import java.util.function.Supplier;

/**
 * Created by kasia on 20/03/2016.
 */
public class SuppliersExample {
    public static void main(String[] arg) {
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();   //new Persons
    }
}
