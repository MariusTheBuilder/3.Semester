package intro_assignment_s7.Box;
import java.util.Objects;

public class Box <T> {
    private T content;

    public Box(T content) {
        this.content = Objects.requireNonNull(content, "Box content cannot be null");
    }

    public void setContent(T content){
        this.content = Objects.requireNonNull(content, "Box content cannot be null");;
    }

    public T getContent() {
        return content;
    }
}