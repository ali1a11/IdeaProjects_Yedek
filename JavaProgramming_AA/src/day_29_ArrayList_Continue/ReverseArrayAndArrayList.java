package day_29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        //reverse of array

        int[] result = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--, j++) {

            result[j] = array[i];

        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Reverse of Array: " + Arrays.toString(result)); // Reverse of Array: [6, 5, 4, 3, 2, 1]

        //--------------------

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            int each = list.get(i);
            reversedList.add(each);
        }

        System.out.println("Reversed List = " + reversedList); // Reversed List = [8, 7, 6, 5, 4, 3, 2, 1]

    }
}
