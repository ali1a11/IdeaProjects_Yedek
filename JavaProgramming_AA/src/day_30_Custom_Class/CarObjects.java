package day_30_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        //DataType  variableName =
        Car car1 = new Car();

        car1.setInfo("Toyota", "Camry", "White", 2020, 35000);

        System.out.println(car1); // Car{brand='Toyota', model='Camry', color='White', year=2020, price= $35000.0}

        Car car2 = new Car();
        car2.setInfo("BMW", "331is", "black", 2020, 45000);

        System.out.println(car2); // Car{brand='BMW', model='331is', color='black', year=2020, price= $45000.0}

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "red", 2018, 40000);

        System.out.println(car3); // Car{brand='Audi', model='Q7', color='red', year=2018, price= $40000.0}

        // We can put these Car object inta a data structure. ArrayList is better. It allow us add and remove

        //Array of Car objects
        // Car[] cars = {car1, car2, car3};
        // System.out.println(Arrays.toString(cars)); //[Car{brand='Toyota', model='Camry', color='White', year=2020, price= $35000.0}, Car{brand='BMW', model='331is', color='black', year=2020, price= $45000.0}, Car{brand='Audi', model='Q7', color='red', year=2018, price= $40000.0}]

        // ArrayList of Car objects
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        // reaching each object in the ArrayList and their attributes
        for (Car each : carsList) {
            System.out.println(each.brand + ": " + each.price);
        }

        /*
        remove if
        BMW: 2005- 2008
        Toyota: 1995 - 1997
         */

        carsList.removeIf(p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf(p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year <= 1997);


    }
}
