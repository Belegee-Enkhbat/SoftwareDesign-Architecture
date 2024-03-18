package relation;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
}

public class Composition {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1");
        Book book2 = new Book("Book 2");
        Book book3 = new Book("Book 3");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printBooks();
    }
}
