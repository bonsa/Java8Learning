package functionalinterface;

/**
 * Created by kasia on 29/09/2015.
 */
public class Person {
    String firstName;
    String lastName;

    Person() {
        System.out.print("new Person");
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang.builder.ToStringBuilder(this)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .toString();
    }
}
