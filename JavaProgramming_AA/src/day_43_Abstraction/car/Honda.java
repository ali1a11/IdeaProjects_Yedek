package day_43_Abstraction.car;

public final class Honda extends Car{ // this class cannot be inherited (final) except abstract classes

    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("Twist the key to ignition");

    }


}
