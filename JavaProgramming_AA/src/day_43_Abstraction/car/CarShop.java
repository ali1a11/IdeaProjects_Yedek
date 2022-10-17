package day_43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {

    // We cannot create object from Abstract class, because abstract class is not concrete
    // Car car1 = new Car("NewCARBrand", "EU09", "Red", 2022, 100000);

        Honda honda1 = new Honda("Accord", "black", 2020, 30000);
        Audi audi1 = new Audi("Q7", "blue", 2019, 45000);
        Tesla tesla1 = new Tesla("M3", "white", 2020, 60000);

        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println(tesla1);

        honda1.setColor("red");
        audi1.setColor("white");
        tesla1.setColor("pink");

        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println(tesla1);



    }
}
