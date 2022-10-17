package day_53_Build_in_Functional_Interfaces_Stream;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildinFunctionalInterfaces2 {
    public static void main(String[] args) {


        // If function accepts two arguments and return boolean
        // BiPredicate can be used

        //Create a function that can check if the Integer is contained in an array of integer, return boolean
        BiPredicate<Integer[], Integer> contains = (a, b) -> {// BiPredicate<T, U> // boolean test(T t, U u);
            boolean result = false;

            for (Integer each : a) {
                if (each == b) {
                    result = true;
                    break;
                }
            }

            return result;
        };

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean r1 = contains.test(arr, 11);
        System.out.println("r1 = " + r1);

        System.out.println("---------------------------------------------");
        // create a function that can check if two strings are anagram
        // An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
        // "a gentleman" - "elegant man"

        BiPredicate<String, String> anagram = (a, b) -> {
            // a = a.replace(" ", "");
            // b = b.replace(" ", "");
            String[] arr1 = a.split("");
            String[] arr2 = b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        String s1 = "agentleman";
        String s2 = "elegant man";
        boolean b1 = anagram.test(s1, s2);
        System.out.println("b1 = " + b1);

        System.out.println("-------------------------------");
        System.out.println("---------------BiConsumer----------------");
        //interface BiConsumer<T, U>  // void accept(T t, U u);

        // create a function that can print the given string for given number of times
        BiConsumer<String, Integer> printMultipleTimes = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };

        String text = "Wooden spoon";

        printMultipleTimes.accept(text, 5);

        //create a function that takes two String and prints formatted
        // "jAvA", "PROGRAMMING" -> "Java Programming"

        System.out.println("---------------------");
        BiConsumer<String, String> formatTwoText = (str1, str2) -> {
            str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase();
            str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1).toLowerCase();
            System.out.println(str1 + " " + str2);
        };

        formatTwoText.accept("jAvA", "PROGRAMMING"); //Java Programming

        System.out.println("--------------------------");
        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", "SM");
        scrumTeam1.put("Nikita", "Developer");
        scrumTeam1.put("Alina", "Developer");
        scrumTeam1.put("Mert", "PO");
        scrumTeam1.put("Lee", "SDET");

        // Printing the member of scrum team using for loop
        /*
        for (Map.Entry<String, String> entry : scrumTeam1.entrySet()) {
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        */

        // Printing the member of scrum team using forEach
        scrumTeam1.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("-------------------------------");
        System.out.println("---------------BiFunction----------------");
        // BiFunction<T, U, R>  // R apply(T t, U u);
        // if the function takes two arguments and return one value (any type) (Parameters and return value can be same type)
        // BiFunction can be used

        // 1. create a function that takes two integers and returns the maximum integer
        /*
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> {
            int maximum = 0;

            if (a>b){
              maximum = a;
          } else {
              maximum = b;
          }
            return maximum;
        };
         */
        // short version
        BiFunction<Integer, Integer, Integer> maxNum = (a, b) -> (a > b) ? a : b;

        int m = maxNum.apply(5, 8);

        System.out.println("m = " + m);

        System.out.println("------------------");
        //2. create a function that can merge two integer arrays into a list
        /*
        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {

            List<Integer> result = new ArrayList<>();
            for (int each : x) {
                result.add(each);
            }
            for (int each : y) {
                result.add(each);
            }
            return result;
        };
         */


        BiFunction<int[], int[], List<Integer>> merge = (x, y) -> {

            List<Integer> result = new ArrayList<>();
            for (int each : x) result.add(each);

            for (int each : y) result.add(each);

            return result;
        };

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};

        List<Integer> nums = merge.apply(arr1, arr2);

        System.out.println("nums = " + nums);

        System.out.println("------------------");
        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map
        /*
        names ==> {"Josh", "Daniel"}
        score ==> {100, 110}

        map ==> {Josh=100, Daniel=110}
        */

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> merge2 = (j, k) -> {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i), k.get(i));
            }
            return map;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Kseniia", "Aygun"));

        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));

        Map<String, Integer> students = merge2.apply(names, scores);

        System.out.println(students);

    }
}
