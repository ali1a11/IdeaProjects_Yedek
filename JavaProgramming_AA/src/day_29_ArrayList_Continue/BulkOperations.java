package day_29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // addAll() adds collection of values to the arrayList
        list.addAll(Arrays.asList(1, 2, 3, 3, 4, 5, 5, 5, 6, 7, 7, 7)); // needs Arrays.asList()

        System.out.println(list); // [1, 2, 3, 3, 4, 5, 5, 5, 6, 7, 7, 7]

        // removeAll() removes all the matching elements from the arraylist
        list.removeAll(Arrays.asList(3, 5, 7)); // needs Arrays.asList() // removes all the given elements and duplicates
        System.out.println(list); // [1, 2, 4, 6]

        // retainAll() removes all the non-matching elements from the arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500, 60, 700, 100, 200, 300, 800, 900));

        numbers.retainAll(Arrays.asList(100, 200, 300)); //numbers you want to keep in the list, others will be removed
        System.out.println(numbers);

        //--
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum master", "BA", "BA"));
        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

        //----
        //containsAll(): checks if all the elements are contained in the arraylist

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 10));

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10));
        System.out.println("r3 = " + r3);

        //----------------------------

        String[] names = {"John", "Jack", "Tom", "Jerry"};

        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names)); // to convert nonprimitive array to arraylist

        ArrayList<String> namesList2 = new ArrayList<>(Arrays.asList(names)); //other way


        //---to convert primitive array to array list
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // ArrayList<Integer> List2 = new ArrayList<>(Arrays.asList(arr)); // it gives compile error
        // if the array consists of primite type we cannot use Arrays.asList()

        //If it is Integer array it can be converted to Array List

        Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> List2 = new ArrayList<>(Arrays.asList(arr2));

        System.out.println(List2);

        //----------------------
        // For using primitive array we can write our own method convertArrayList

        int [] arr3 = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayList(arr3)); // int array i bu sekilde kullanabiliriz

    }

    public static ArrayList<Integer> convertArrayList(int[] array) { // int array i bu sekilde kullanabiliriz
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }

}
