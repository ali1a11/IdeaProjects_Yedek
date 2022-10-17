package day_21_Arrays_Utility_for_Each_Loop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String[] earlyBirds = Arrays.copyOf(students, 3); //copies the first three elements of students Array

        System.out.println(Arrays.toString(earlyBirds)); //[Elif, Sinem, Gunay]

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = Arrays.copyOf(numbers, 5); //assigning the first five elements to same variable

        System.out.println(Arrays.toString(numbers)); //[1, 2, 3, 4, 5]

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

        char[] ch2 = Arrays.copyOfRange(ch1,2,6);

        System.out.println(Arrays.toString(ch2)); // [C, D, E, F]

        //

        int [] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int [] result = Arrays.copyOfRange(scores, 3, 7);

        System.out.println(Arrays.toString(result));

        int [] result2 = Arrays.copyOfRange(scores, 5, scores.length); //scores.length =10
        System.out.println(Arrays.toString(result2));








    }
}
