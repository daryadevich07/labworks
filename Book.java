package library;

/**
 * Класс, представляющий книгу в библиотеке.
 * Содержит информацию о названии, авторе и годе написания.
 */
public class Book {
    private String title;
    private String author;
    private int year;

    /**
     * Конструктор книги.
     * @param title название книги
     * @param author автор книги
     * @param year год написания
     */
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    /** @return название книги */
    public String getTitle() {
        return title;
    }

    /** @return автор книги */
    public String getAuthor() {
        return author;
    }

    /** @return год написания книги */
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("Название: %s | Автор: %s | Год: %d", title, author, year);
    }
}

