package day_29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 7, 9, 6, 3, 1, 5, 2, 4, 8));

        // Collections.sort();
        Collections.sort(list);
        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //-------------------------------------------

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        System.out.println(list2); // [A, B, C, D, E]

        Collections.reverse(list2);

        System.out.println(list2); // [E, D, C, B, A]

        //----------------------------------------------
        // swap

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list3); // [10, 20, 30, 40, 50, 60]

        Collections.swap(list3, 4, 1);

        System.out.println(list3); // [10, 50, 30, 40, 20, 60]

        //-----------------------------------------------
        // max and min

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("max = " + max); // max = 60
        System.out.println("min = " + min); // min = 10

        //------------------------------------------------
        //replaceAll

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 10, 10, 10));

        System.out.println(list4); // [10, 10, 20, 30, 40, 50, 10, 10, 10]

        Collections.replaceAll(list4, 10, 1000);

        System.out.println(list4); // [1000, 1000, 20, 30, 40, 50, 1000, 1000, 1000]

        //-----------------------------------------------
        // frequency

        int frequency = Collections.frequency(list4, 1000);

        System.out.println("frequency = " + frequency); // frequency = 5

        //---------------------------------------------

        ArrayList<String> words =new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "C++", "Python", "Python", "C#", "C#"));

        int countJava = Collections.frequency(words, "Java");
        int countPython = Collections.frequency(words, "Python");

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);



    }
}
