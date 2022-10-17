package from_Short_Videos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods_2 {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Banana");
        groceryList.add("Apple");
        groceryList.add("Cheese");
        groceryList.add("Soy sauce");
        groceryList.add("Salt");
        groceryList.add("Sugar");

        System.out.println("-------------------------------");
        // contains(element)

        System.out.println("groceryList.contains(\"Apple\") = " + groceryList.contains("Apple")); //groceryList.contains("Apple") = true


        System.out.println("-------------------------------");
        // equals(list)
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Banana");
        list1.add("Apple");
        list1.add("Cheese");
        list1.add("Soy sauce");
        list1.add("Salt");
        list1.add("Sugar");

        System.out.println("list1.equals(groceryList) = " + list1.equals(groceryList)); // list1.equals(groceryList) = true

        System.out.println("-------------------------------");
        //isEmpty()

        System.out.println("groceryList.isEmpty() = " + groceryList.isEmpty()); // groceryList.isEmpty() = false

        System.out.println("-------------------------------");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        // containsAll(CollectionType)

        System.out.println("numbers.containsAll(Arrays.asList(10, 20, 30, 40)) = " + numbers.containsAll(Arrays.asList(10, 20, 30, 40)));


        System.out.println("-------------------------------");
        //addAll(CollectionType)
        numbers.addAll(Arrays.asList(70, 80, 90, 95, 100));

        System.out.println("numbers = " + numbers); // numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 95, 100]

        System.out.println("-------------------------------");
        // removeAll(CollectionType)
        numbers.removeAll(Arrays.asList(10, 50, 80));

        System.out.println("numbers = " + numbers); // numbers = [20, 30, 40, 60, 70, 90, 95, 100]
        System.out.println("-------------------------------");
        // retainAll(CollectionType)

        numbers.retainAll(Arrays.asList(20, 40, 70));
        System.out.println("numbers = " + numbers); // numbers = [20, 40, 70]

    }
}
