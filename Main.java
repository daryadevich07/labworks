package demo;

import library.Book;
import library.Library;
import library.LibraryRepository;

/**
 * Демонстрация работы библиотек и репозитория библиотек.
 */
public class Main {
    public static void main(String[] args) {

        LibraryRepository repo = new LibraryRepository();

        Library central = new Library("Центральная библиотека");
        Library university = new Library("Университетская библиотека");

        repo.addLibrary(central);
        repo.addLibrary(university);

        // Добавление книг
        central.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", 1940));
        central.addBook(new Book("Белая гвардия", "Михаил Булгаков", 1925));

        university.addBook(new Book("Собачье сердце", "Михаил Булгаков", 1925));
        university.addBook(new Book("Идиот", "Фёдор Достоевский", 1869));

        // Поиск по автору
        System.out.println("=== Книги Булгакова ===");
        for (Library lib : repo.getLibraries()) {
            for (Book b : lib.getBooksByAuthor("Михаил Булгаков")) {
                System.out.println(lib + " -> " + b);
            }
        }

        // Печать всех библиотек и их содержимого
        System.out.println("\n=== Все библиотеки ===");
        for (Library lib : repo.getLibraries()) {
            System.out.println(lib);
            for (Book b : lib.getBooks()) {
                System.out.println("  " + b);
            }
        }
    }
}
