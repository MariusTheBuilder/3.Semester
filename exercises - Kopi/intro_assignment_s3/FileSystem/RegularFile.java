package intro_assignment_s3.FileSystem;

import java.time.LocalDate;

public class RegularFile extends Entry {
    private long fileSize;

    public RegularFile(String name, LocalDate creationDate, long fileSize) {
        super(name, creationDate);
        this.fileSize = fileSize;
    }

    @Override
    public long size() {
        return fileSize;
    }
}

