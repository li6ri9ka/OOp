import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    static List<Book> books = new ArrayList<>();


    public static void addBook(Book book) {
        books.add(book);
    }

    public static void searchBookByAuthor(String author) {
        for (Book book1 : books) {
            if (book1.getAuthor().equals(author)) {
                System.out.println("По данному автору найдена книга: " + book1);
            }
        }
    }
    public static void searchBookByYear(int year) {
        for (Book book1 : books) {
            if (book1.getYear() == year) {
                System.out.println("По данному году найдена книга: "+ book1);
            }
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Title","Author",1999);
        Book book2 = new Book("Title1","Author1",2000);
        Book book3 = new Book("Title2","Author2",2000);
        addBook(book1);
        addBook(book2);
        addBook(book3);

        searchBookByYear(2000);

        searchBookByAuthor("Author1");
    }


}
