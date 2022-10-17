package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(20);
        list.add(10);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if(result.contains(each)){
                continue;
            }
            result.add(each);

        }
        System.out.println(result); // [10, 20, 30]

        //--------------------------

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        
        boolean b3 = list1.equals(list2);
        System.out.println("b3 = " + b3); // b3 = true

        //------------------------
        // isEmpty()

        boolean r4 = list1.isEmpty();
        System.out.println("r4 = " + r4); // r4 = false

        list1.clear();
        boolean r5 = list1.isEmpty();
        System.out.println("r5 = " + r5); // r5 = true

        //-----------
        // addAll()
        //Bulk operation: CollectionType

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println(numbers); // [1, 2, 3, 4, 5, 6, 7]
    }
}
