package day_38_Inheritance_Cont.CarTask;

public class Tesla extends Car{
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " has auto pilot");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start \" to start " + brand + " " + model);
    }
}
