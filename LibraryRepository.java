package library;

import java.util.ArrayList;
import java.util.List;

/**
 * Репозиторий библиотек.
 * Позволяет добавлять, удалять и изменять сами библиотеки.
 */
public class LibraryRepository {

    private List<Library> libraries = new ArrayList<>();

    /** Добавление библиотеки */
    public void addLibrary(Library library) {
        libraries.add(library);
    }

    /** Удаление библиотеки */
    public void removeLibrary(Library library) {
        libraries.remove(library);
    }

    /** Обновление библиотеки */
    public void updateLibrary(Library oldLib, Library newLib) {
        int idx = libraries.indexOf(oldLib);
        if (idx != -1) {
            libraries.set(idx, newLib);
        }
    }

    /** Получение всех библиотек */
    public List<Library> getLibraries() {
        return new ArrayList<>(libraries);
    }
}
