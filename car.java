public class car {
    // Поля автомобиля
    private int id;
    private String brand;      // Марка
    private String model;      // Модель
    private int year;          // Год выпуска
    private String color;      // Цвет
    private double price;      // Цена
    private String regNumber;  // Регистрационный номер

    // Конструктор
    public car(int id, String brand, String model, int year, String color, double price, String regNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    // Сеттеры (setТип)
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setColor(String color) { this.color = color; }
    public void setPrice(double price) { this.price = price; }
    public void setRegNumber(String regNumber) { this.regNumber = regNumber; }

    // Геттеры (getТип)
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
    public String getRegNumber() { return regNumber; }

    // toString для удобного вывода
    @Override
    public String toString() {
        return id + " | " + brand + " | " + model + " | " + year + " | " + color + " | " + price + " | " + regNumber;
    }
}