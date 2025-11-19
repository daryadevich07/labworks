import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        // Создаём массив машин
        car[] cars = {
            new car(1, "Toyota", "Camry", 2015, "Black", 15000, "A123BC"),
            new car(2, "BMW", "X5", 2018, "White", 35000, "B456CD"),
            new car(3, "Toyota", "Corolla", 2010, "Silver", 8000, "C789DE"),
            new car(4, "Audi", "A6", 2015, "Blue", 20000, "D012EF"),
            new car(5, "BMW", "X5", 2012, "Black", 17000, "E345FG")
        };

        // ---------- a) Список автомобилей заданной марки ----------
        String brandToFind = "Toyota";
        System.out.println("Автомобили марки " + brandToFind + ":");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().equalsIgnoreCase(brandToFind)) {
                System.out.println(cars[i]);
            }
        }

        // ---------- b) Список автомобилей заданной модели, старше n лет ----------
        String modelToFind = "X5";
        int n = 7;  // Сколько лет
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("\nАвтомобили модели " + modelToFind + " старше " + n + " лет:");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel().equalsIgnoreCase(modelToFind) && (currentYear - cars[i].getYear() > n)) {
                System.out.println(cars[i]);
            }
        }

        // ---------- c) Список автомобилей заданного года выпуска, цена выше указанной ----------
        int yearToFind = 2015;
        double minPrice = 18000;
        System.out.println("\nАвтомобили " + yearToFind + " года, цена выше " + minPrice + ":");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() == yearToFind && cars[i].getPrice() > minPrice) {
                System.out.println(cars[i]);
            }
        }
    }
}

