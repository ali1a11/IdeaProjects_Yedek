package day_32_CustomClass_Constructor;

public class CarObjects {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Lexus", "RX256", 2021);
        Car car4 = new Car("BMW", "X6", 2020, 50000);
        Car car5 = new Car ("Toyota", "Corolla", 2020,20000, "white");

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);



    }




}
