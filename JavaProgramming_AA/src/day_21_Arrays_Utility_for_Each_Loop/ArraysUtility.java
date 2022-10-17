package day_21_Arrays_Utility_for_Each_Loop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5,};

        String str = "Java";

        System.out.println(str);// implicitly calls toString method
        System.out.println(str.toString());

        //Arrays do not call implicitly calls toString method you must call toString method explicitly
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]); //to print element of an Array

        int[] scores = {80, 52, 65, 99, 26, 75};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min score: " + scores[0]);
        System.out.println("Max score: " + scores[scores.length - 1]);

        String[] names = {"Guray", "Deniz", "Maria", "Ahmet", "Sabri", "Ece", "Anna"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        String[] names2 = {"Anna", "ANNA"};
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names2)); //[ANNA, Anna] sorts according to ASCII table

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        boolean r = Arrays.equals(arr1, arr2);
        System.out.println(r); // false

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1, arr2);
        System.out.println(r2); // true

        //"acb", "bac" Are they anagram (words contains exact letters)
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1)); //[a, b, c]
        System.out.println(Arrays.toString(ch2)); //[a, b, c]

        boolean anagram = Arrays.equals(ch1, ch1);
        System.out.println("Anagram?: " + anagram); //true





    }
}
