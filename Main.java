import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        // Создаём репозиторий
        CarRepository repo = new CarRepository();

        // ---------- Добавляем автомобили ----------
        repo.add(new Car(1, "Toyota", "Camry", 2015, "Black", 15000, "A123BC"));
        repo.add(new Car(2, "BMW", "X5", 2018, "White", 35000, "B456CD"));
        repo.add(new Car(3, "Toyota", "Corolla", 2010, "Silver", 8000, "C789DE"));
        repo.add(new Car(4, "Audi", "A6", 2015, "Blue", 20000, "D012EF"));
        repo.add(new Car(5, "BMW", "X5", 2012, "Black", 17000, "E345FG"));

        // Получаем список всех машин
        var cars = repo.getAll();

        // ---------- a) Автомобили по марке ----------
        String brandToFind = "Toyota";
        System.out.println("Автомобили марки " + brandToFind + ":");

        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brandToFind)) {
                System.out.println(car);
            }
        }

        // ---------- b) Модель старше n лет ----------
        String modelToFind = "X5";
        int n = 7;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("\nАвтомобили модели " + modelToFind + " старше " + n + " лет:");
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(modelToFind)
                    && currentYear - car.getYear() > n) {
                System.out.println(car);
            }
        }

        // ---------- c) Год + цена выше ----------
        int yearToFind = 2015;
        double minPrice = 18000;

        System.out.println("\nАвтомобили " + yearToFind + " года, цена выше " + minPrice + ":");
        for (Car car : cars) {
            if (car.getYear() == yearToFind && car.getPrice() > minPrice) {
                System.out.println(car);
            }
        }
    }
}
