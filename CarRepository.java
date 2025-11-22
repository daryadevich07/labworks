import java.util.ArrayList;
import java.util.List;

/**
 * Класс Repository — хранилище объектов Car.
 * Позволяет добавлять, удалять, изменять и получать элементы.
 */
public class CarRepository {

    private final List<Car> cars = new ArrayList<>();

    /** Добавляет автомобиль в коллекцию */
    public void add(Car car) {
        cars.add(car);
    }

    /** Удаляет автомобиль по ID */
    public boolean removeById(int id) {
        return cars.removeIf(c -> c.getId() == id);
    }

    /** Обновляет автомобиль по ID */
    public boolean update(int id, Car newCar) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId() == id) {
                cars.set(i, newCar);
                return true;
            }
        }
        return false;
    }

    /** Возвращает список всех автомобилей */
    public List<Car> getAll() {
        return cars;
    }
}
