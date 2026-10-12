package intro_assignment_s3.FileSystem;
import java.time.LocalDate;

public abstract class Entry {
    private String name;
    private LocalDate creationDate;

    public Entry(String name, LocalDate creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public abstract long size();

    public String getName() {
        return name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

}
