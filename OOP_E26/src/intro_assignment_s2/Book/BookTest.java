package intro_assignment_s2.Book;

// Book: title, author, publicationYear, pages, ISBN, language

// (b1) Minimal book:   no ISBN, no language
// (b2) Book with ISBN, no language
// (b3) Anonymous Book: no author
// (b4) Full book:      ISBN and language

public class BookTest {
    public static void main(String[] args){
        Book b1 = new Book("Math = Math", "Mr. Incredible", 2026, 53);
        Book b2 = new Book("Players Handbook", "Wizards of the Coast", 1999, 318);
        Book b3 = new Book("My mind on paper", 2022, 12, "03997648", "English");
        Book b4 = new Book("Coding in Java", "Marius Frey", 2026, 333, "0303030316", "Danish");

        System.out.println(b1 + " -> " + b1.timeToRead(2) + " minutes to read");
        System.out.println(b2 + " -> " + b2.timeToRead(2) + " minutes to read");
        System.out.println(b3 + " -> " + b3.timeToRead(2) + " minutes to read");
        System.out.println(b4 + " -> " + b4.timeToRead(2) + " minutes to read");
    }
}
