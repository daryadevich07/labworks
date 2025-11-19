package library;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий библиотеку.
 * Хранит название и список книг, а также методы для работы с ними.
 */
public class Library {
    private String name;
    private List<Book> books;

    /**
     * Конструктор библиотеки.
     * @param name название библиотеки
     */
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    /**
     * Добавляет книгу в библиотеку.
     * @param book книга для добавления
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Возвращает все книги библиотеки.
     * @return список книг
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Возвращает книги заданного автора.
     * @param author имя автора
     * @return список книг автора
     */
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

