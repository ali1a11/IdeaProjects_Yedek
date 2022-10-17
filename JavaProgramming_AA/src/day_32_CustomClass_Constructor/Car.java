package day_32_CustomClass_Constructor;
/*
class name: Car
instance variables: make, model, year, price, color

 1st constructor: initializes the make ONLY

 2nd constructor: initializes make & model
 (MUST use constructor call to set the make)

3rd constructor: initializes make, model, year
(MUST use constructor call to set the make, model)

4th constructor: initializes make, model, year, price
(MUST use constructor call to set the make, model, year)

5th Constructor: intializes all the instances
(MUST use constructor call to set the make, mode, year, price, color)

 */

public class Car {
    public String make, model, color;
    public int year, price;

    public Car(String make){
        this.make = make;
    }

    public Car (String make, String model){
        this(make);
        this.model = model;
    }

    public Car (String make, String model, int year){
        this(make, model);
        this.year = year;
    }

    public Car (String make, String model, int year, int price){
        this(make, model, year);
        this.price = price;
    }


    public Car (String make, String model, int year, int price, String color){
        this(make, model, year, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
