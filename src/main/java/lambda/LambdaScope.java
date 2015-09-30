package lambda;

import functionalinterface.Converter;

/**
 * Created by kasia on 30/09/2015.
 */
public class LambdaScope {

    public static void main(String[] arg) {
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);

        stringConverter.convert(2);
    }
}
