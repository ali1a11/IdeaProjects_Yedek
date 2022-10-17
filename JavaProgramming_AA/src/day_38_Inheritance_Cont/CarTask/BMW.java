package day_38_Inheritance_Cont.CarTask;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles); // brand
    }
    public void breaksDown(){
        System.out.println(brand + " " + model + " breaks down.");
    }

    public void racing(){
        System.out.println(brand + " " + model + " is racing.");
    }

    public void start(){
        System.out.println(brand + " " + model + " call mechanic to jump start");
    }

}
