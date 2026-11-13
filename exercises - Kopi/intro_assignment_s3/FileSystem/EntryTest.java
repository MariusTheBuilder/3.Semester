package intro_assignment_s3.FileSystem;
import java.time.LocalDate;

public class EntryTest {
    public static void main(String[] args) {
        Directory root = new Directory("root", LocalDate.of(2020, 1, 1));

        RegularFile file1 = new RegularFile("a.txt", LocalDate.of(2021, 5, 1), 100);
        RegularFile file2 = new RegularFile("b.txt", LocalDate.of(2019, 3, 1), 200);

        Directory sub = new Directory("sub", LocalDate.of(2020, 6, 1));
        RegularFile file3 = new RegularFile("c.txt", LocalDate.of(2022, 1, 1), 50);
        sub.add(file3);

        root.add(file1);
        root.add(file2);
        root.add(sub);

        System.out.println("Total size: " + root.size());
        System.out.println("Oldest file: " + root.oldestFile().getName());
        System.out.println("Newest file: " + root.newestFile().getName());
    }
}