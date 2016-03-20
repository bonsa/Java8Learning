package functionalinterface;

import java.util.Optional;

/**
 * Created by kasia on 20/03/2016.
 */
public class OptionalExample {

    public static void main(String[] arg) {

        Optional<String> optional = Optional.of("bam");

        optional.isPresent();
        optional.get();
        optional.orElse("fallback");

        optional.ifPresent((s) -> System.out.println(s.charAt(0)));

    }

}
