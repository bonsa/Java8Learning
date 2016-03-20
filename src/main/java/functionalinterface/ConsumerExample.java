package functionalinterface;

import java.util.function.Consumer;

/**
 * Created by kasia on 20/03/2016.
 */
public class ConsumerExample {

    public static void main(String[] arg) {
        Consumer<Person> greeter;
        greeter = (p) -> System.out.print("Hello, " + p.firstName);
        greeter.accept(new Person("Luke", "Skywalker"));
    }
}

