package intro_assignment_s2.Book;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int pages;
    private String isbn;
    private String language;

    // Minimal book: no ISBN, no language
    public Book(String title, String author, int publicationYear, int pages) {
        this(title, author, publicationYear, pages, null, null);
    }

    // Book with ISBN, no language
    public Book(String title, String author, int publicationYear, int pages, String isbn) {
        this(title, author, publicationYear, pages, isbn, null);
    }

    //Anonymous Book: no author
    public Book(String title, int publicationYear, int pages, String isbn, String language) {
        this(title, null, publicationYear, pages, isbn, language);
    }

    // Full book: ISBN and language
    public Book(String title, String author, int publicationYear, int pages, String isbn, String language) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.isbn = isbn;
        this.language = language;
    }

    public double timeToRead(double pagesPerMinute) {
        return pages / pagesPerMinute;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + publicationYear + "), " + pages + " pages";
    }
}
