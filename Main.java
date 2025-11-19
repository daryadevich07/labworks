package demo;

import library.Book;
import library.Library;

/**
 * Демонстрационное приложение для работы с библиотеками и книгами.
 */
public class Main {
    public static void main(String[] args) {
        Library centralLibrary = new Library("Центральная библиотека");
        Library universityLibrary = new Library("Университетская библиотека");

        centralLibrary.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1940));
        centralLibrary.addBook(new Book("Белая гвардия", "Михаил Булгаков", 1925));
        centralLibrary.addBook(new Book("Преступление и наказание", "Фёдор Достоевский", 1866));

        universityLibrary.addBook(new Book("Идиот", "Фёдор Достоевский", 1869));
        universityLibrary.addBook(new Book("Собачье сердце", "Михаил Булгаков", 1925));
        universityLibrary.addBook(new Book("Братья Карамазовы", "Фёдор Достоевский", 1880));

        System.out.println("=== Книги Михаила Булгакова ===");
        for (Book book : centralLibrary.getBooksByAuthor("Михаил Булгаков")) {
            System.out.println(book);
        }
        for (Book book : universityLibrary.getBooksByAuthor("Михаил Булгаков")) {
            System.out.println(book);
        }

        System.out.println("\n=== Все книги в Центральной библиотеке ===");
        for (Book book : centralLibrary.getBooks()) {
            System.out.println(book);
        }

        System.out.println("\n=== Все книги в Университетской библиотеке ===");
        for (Book book : universityLibrary.getBooks()) {
            System.out.println(book);
        }
    }
}
