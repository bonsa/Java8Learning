package functionalinterface;

/**
 * Created by kasia on 29/09/2015.
 */
public interface PersonFactory <P extends Person> {
    P create(String firstName, String lastName);
}
