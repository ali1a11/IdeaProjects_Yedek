package day_43_Abstraction.car;


// Abstract class
// object cannot be created from abstract class

public abstract class Car {

    private final String brand, model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);

        //for final variable we can set the condition in constructor
        if (year < 1886) {
            throw new RuntimeException("Invalid year: " + year);
        }
        this.year = year;
        setPrice(price);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if (price <= 0) {
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    //--

    public void stop() {
        System.out.println("Press the brake");
    }

    // only abstract class or interface can have abstract method
    public abstract void start();


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

}
