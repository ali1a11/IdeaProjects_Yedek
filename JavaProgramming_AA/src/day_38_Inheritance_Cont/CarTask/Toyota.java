package day_38_Inheritance_Cont.CarTask;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles); // brand
    }
    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

    @Override // it can be used to check whether the method is overridden // if it compiles it is overridden
    public void start(){
        System.out.println("Twist the key to ignition to start " + brand + " " + model);
    }

}

