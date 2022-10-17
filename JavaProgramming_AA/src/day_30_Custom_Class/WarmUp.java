package day_30_Custom_Class;
/*
1. Write a program that can swap the first and last elements of an ArrayList
2. Write a program that can move all the zeros to the last indexes of ArrayList
Ex:
List : {1, 0, 2, 0, 3, 0, 4, 0}
output: {1, 2, 3, 4, 0, 0, 0, 0}
3. Write a program that can exract the special characters, digits and letters from a string and stores them into separate ArrayList
Ex:
str: "ABCD123$%#@&456EFG!"
output:
List1: {1, 2, 3, 4, 5, 6}
List2: {A, B, C, D, E, F, G}
List3: {$, %, #, @, &, !}
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp {
    public static void main(String[] args) {

        // 1.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        System.out.println(numbers);

        Collections.swap(numbers, 0, numbers.size() - 1);

        System.out.println(numbers);


        // 2.
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        System.out.println(list); // [1, 0, 2, 0, 3, 0, 4, 0]

        int size = list.size();

        list.removeAll(Arrays.asList(0));

        System.out.println(list); // [1, 2, 3, 4]

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros); // totalNumberOfZeros = 4

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        System.out.println(list); // [1, 2, 3, 4, 0, 0, 0, 0]

        // solution with new ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);
            }
        }
        System.out.println(result); // [1, 2, 3, 4]

        for (Integer each : list2) {
            if (each == 0) {
                result.add(each);
            }
        }
        System.out.println(result); // [1, 2, 3, 4, 0, 0, 0, 0]

        //3.
        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        // to convert string to ArrayList

        for (int i = 0; i < str.length(); i++) {

            chars.add(str.charAt(i));

        }

        System.out.println(chars); // [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        ArrayList<Character> letters = new ArrayList<>(chars);
        System.out.println(letters); // [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        letters.removeIf(p -> !Character.isLetter(p));

        System.out.println("letters = " + letters);// letters = [A, B, C, D, E, F, G]


        ArrayList<Character> digits = new ArrayList<>(chars);

        digits.removeIf(p -> !Character.isDigit(p));

        System.out.println("digits = " + digits); // digits = [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChars = new ArrayList<>(chars);

        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        //specialChars.removeIf(p -> Character.isLetterOrDigit(p));

        System.out.println("specialChars = " + specialChars); // specialChars = [$, %, #, @, &, !]

    }
}
