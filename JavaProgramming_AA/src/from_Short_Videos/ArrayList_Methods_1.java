package from_Short_Videos;

import java.util.ArrayList;

public class ArrayList_Methods_1 {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        // add()

        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy sauce");

        System.out.println("groceryList = " + groceryList); // groceryList = [Banana, Apple, Cheese, Soy sauce]

        System.out.println("-------------------");
        // size()
        System.out.println("groceryList.size() = " + groceryList.size());

        System.out.println("-------------------");

        // get(index)
        System.out.println("groceryList.get(1) = " + groceryList.get(1)); // groceryList.get(1) = Apple

        System.out.println("-------------------");
        // set(index, newElement)
        groceryList.set(2, "Egg");

        System.out.println("groceryList = " + groceryList); // groceryList = [Banana, Apple, Egg, Soy sauce]


        System.out.println("-------------------");
        //remove(int index)
        groceryList.remove(3);
        System.out.println("groceryList = " + groceryList);

        //remove(Object)
        boolean r1 = groceryList.remove("Apple");
        System.out.println("groceryList = " + groceryList);

        System.out.println("r1 = " + r1); //r1 = true

        boolean r2 = groceryList.remove("Java");
        System.out.println("r2 = " + r2); //r2 = false

        System.out.println("-------------------");
        // clear() removes all elements in the arraylist
        groceryList.clear();
        System.out.println("groceryList = " + groceryList); //groceryList = []

        System.out.println("-------------------");
        // indexOf(element)

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);

        System.out.println("numbers.indexOf(20) = " + numbers.indexOf(20)); // numbers.indexOf(20) = 1

        System.out.println("-------------------");
        // lastIndexOf(element)
        System.out.println("numbers.lastIndexOf(10) = " + numbers.lastIndexOf(10)); // numbers.lastIndexOf(10) = 5


    }
}
