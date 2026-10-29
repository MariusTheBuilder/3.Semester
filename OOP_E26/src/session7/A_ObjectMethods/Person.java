package session7.A_ObjectMethods;

import java.util.Objects;

/**
 * A person with a first name, a last name, an age and, if there is one, a
 * middle name. This is the class of exercise A. It has the fields and the
 * constructors, and none of the methods that President overrides.
 *
 * A person built with the three-argument constructor keeps the empty
 * string "" in middleName, not null.
 */
public class Person {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    /** A person without a middle name. */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = "";
        this.age = age;
    }

    /** A person with a middle name. */
    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(middleName, person.middleName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, age);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age;
    }
}
