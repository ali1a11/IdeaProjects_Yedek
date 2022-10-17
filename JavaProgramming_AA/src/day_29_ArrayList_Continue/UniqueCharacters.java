package day_29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeef";

        String[] arr = str.split(""); // to convert string array to Array list

        System.out.println(Arrays.toString(arr)); // [a, a, a, b, c, c, c, d, e, e, e, f] // Array

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr)); // to convert string array to Array list

        System.out.println("list = " + list); // list = [a, a, a, b, c, c, c, d, e, e, e, f] // ArrayList

        // to finf unique elements in the array list

        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency == 1) {
                unique += each;
            }
        }

        System.out.println("unique = " + unique);

    }
}
