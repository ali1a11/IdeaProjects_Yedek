package day_43_Abstraction.car;

public final class Audi extends Car{ // this class cannot be inherited (final)

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");

    }

    public void autoPark(){
        System.out.println(getBrand() + " " + getModel() + " has auto park feature.");
    }
}
