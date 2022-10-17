package day_30_Custom_Class;
/*
Attributes: brand, model, color, year, price
Actions: drive(), start(), toString(), setInfo()

 */

public class Car {
    // each car can have different attribute with using instance variables
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, int carPrice) {
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive() {
        System.out.println("Driving " + brand + " " + model);
    }

    public void start() {
        System.out.println(brand + " " + model + " has started");
    }

    public void stop() {
        System.out.println(brand + " " + model + " has stopped");
    }


}
