package deneme.MOOC_Part8.HashSet;
// A HashSet is a collection of items where every item is unique

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetIntro {
    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>();

        // adding items
        // add()

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Ford");
        cars.add("BMW");

        // printing HashSet
        System.out.println(cars); // [Volvo, Ford, Mercedes, BMW] // Even though "BMW" was added two times, it appears one

        // to check whether an item exist in HashSet
        // contains()

        System.out.println(cars.contains("Mazda")); // false

        // to remove an item
        // remove()

        cars.remove("Volvo");
        System.out.println("cars = " + cars); // cars = [Ford, Mercedes, BMW]

        // to remove all items in HashSet
        // clear()   // cars.clear();

        // to find out how many items there are
        // size();

        System.out.println("cars.size() = " + cars.size()); // cars.size() = 3

        // loop through a HashSet
        for (String car : cars) {
            System.out.println(car);
        }


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));

        HashSet<Integer> num = new HashSet<>(numbers);

        System.out.println("num = " + num); // num = [1, 2, 3, 4, 5]


    }
}
