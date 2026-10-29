package session7.A_ObjectMethods;

import java.util.Objects;

/**
 * A president, known by name. It is the model for this step. It overrides
 * the three methods of Object that the step is about.
 *
 * Two presidents are equal when they have the same name, so equals compares
 * the names and hashCode is built from the name. toString answers the name,
 * and that is what println shows when it prints a president.
 * (Chapter 7, "The Object Class".)
 */
public class President {

    private String name;

    public President(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Two presidents are equal when they have the same name. The parameter is
     * an Object, as in the equals every class inherits, so any object can be
     * passed in. getClass() answers the class an object was built from. The
     * cast to President comes only after that check.
     * (Chapter 7, "Superclass References and Subclass Objects".)
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        President president = (President) o;
        return Objects.equals(name, president.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    /** The name, so that a president prints as Barack Obama. */
    @Override
    public String toString() {
        return name;
    }
}
