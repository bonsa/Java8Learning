package functionalinterface;

/**
 * Created by kasia on 29/09/2015.
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
