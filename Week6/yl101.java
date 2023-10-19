package Week6;

import java.util.ArrayList;
import java.util.List;

public class yl101 {

    public static class Book {
        private String title;
        private String publisher;
        private int year;

        // Constructor
        public Book(String title, String publisher, int year) {
            this.title = title;
            this.publisher = publisher;
            this.year = year;
        }

        // Getter methods
        public String title() {
            return title;
        }

        public String publisher() {
            return publisher;
        }

        public int year() {
            return year;
        }

        // toString method
        public String toString() {
            return title + ", " + publisher + ", " + year;
        }

    }

    public class StringUtils {
        public static boolean included(String word, String searched) {
            // Check for null strings
            if (word == null || searched == null) {
                return false;
            }

            // Remove leading and trailing white spaces, and make the comparison
            // case-insensitive
            word = word.trim().toLowerCase();
            searched = searched.trim().toLowerCase();

            // Check if the 'word' contains the 'searched' string
            return word.contains(searched);
        }
    }

    public static class Library {
        private List<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        public void addBook(Book newBook) {
            books.add(newBook);
        }

        public void printBooks() {
            for (Book book : books) {
                System.out.println(book);
            }
        }

        public ArrayList<Book> searchByTitle(String title) {
            ArrayList<Book> found = new ArrayList<>();

            for (Book book : books) {
                if (StringUtils.included(book.title(), title)) {
                    found.add(book);
                }
            }

            return found;
        }

        public ArrayList<Book> searchByPublisher(String publisher) {
            ArrayList<Book> found = new ArrayList<>();

            for (Book book : books) {
                if (StringUtils.included(book.publisher(), publisher)) {
                    found.add(book);
                }
            }

            return found;
        }

        public ArrayList<Book> searchByYear(int year) {
            ArrayList<Book> found = new ArrayList<>();

            for (Book book : books) {
                if (book.year() == year) {
                    found.add(book);
                }
            }

            return found;
        }

    }

    public static void main(String[] args) {

        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book : Library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }

    }

}