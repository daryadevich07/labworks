package library;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий библиотеку.
 * Хранит название и список книг.
 */
public class Library {

    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    /** Добавляет книгу */
    public void addBook(Book book) {
        books.add(book);
    }

    /** Удаляет книгу */
    public void removeBook(Book book) {
        books.remove(book);
    }

    /** Обновление книги — замена одной на другую */
    public void updateBook(Book oldBook, Book newBook) {
        int idx = books.indexOf(oldBook);
        if (idx != -1) {
            books.set(idx, newBook);
        }
    }

    /** Список всех книг */
    public List<Book> getBooks() {
        return new ArrayList<>(books); // защитная копия
    }

    /** Поиск по автору */
    public List<Book> getBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Библиотека: " + name + " (" + books.size() + " книг)";
    }
}
