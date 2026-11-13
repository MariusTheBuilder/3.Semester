package intro_assignment_s3.FileSystem;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private List<Entry> entries;

    public Directory(String name, LocalDate creationDate) {
        super(name, creationDate);
        this.entries = new ArrayList<>();
    }

    public void add(Entry entry) {
        entries.add(entry);
    }

    @Override
    public long size() {
        long total = 0;
        for (Entry e : entries) {
            total += e.size(); // works for both RegularFile and nested Directory
        }
        return total;
    }

    public RegularFile oldestFile() {
        return extremeFile(true);
    }

    public RegularFile newestFile() {
        return extremeFile(false);
    }

    private RegularFile extremeFile(boolean oldest) {
        RegularFile result = null;
        for (Entry e : entries) {
            if (e instanceof RegularFile) {
                RegularFile file = (RegularFile) e;
                if (result == null) {
                    result = file;
                } else if (oldest && file.getCreationDate().isBefore(result.getCreationDate())) {
                    result = file;
                } else if (!oldest && file.getCreationDate().isAfter(result.getCreationDate())) {
                    result = file;
                }
            } else if (e instanceof Directory) {
                Directory subDir = (Directory) e;
                RegularFile candidate = oldest ? subDir.oldestFile() : subDir.newestFile();
                if (candidate != null) {
                    if (result == null) {
                        result = candidate;
                    } else if (oldest && candidate.getCreationDate().isBefore(result.getCreationDate())) {
                        result = candidate;
                    } else if (!oldest && candidate.getCreationDate().isAfter(result.getCreationDate())) {
                        result = candidate;
                    }
                }
            }
        }
        return result;
    }
}