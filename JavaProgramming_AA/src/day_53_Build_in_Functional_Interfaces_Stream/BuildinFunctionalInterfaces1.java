package day_53_Build_in_Functional_Interfaces_Stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildinFunctionalInterfaces1 {
    public static void main(String[] args) {

        // Predicate
        // if function takes one parameter and returns boolean
        // Predicate can be used
        System.out.println("----------Predicate-----------");
        //interface Predicate<T> // boolean test(T t);

        Predicate<String> isPalindrome = (p) -> {

            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };

        boolean result1 = isPalindrome.test("Java"); // .test() in Predicate interface @FunctionalInterface

        System.out.println("result1 = " + result1);


        Predicate<Integer> isEven = p -> p % 2 == 0;

        System.out.println("---------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));
        list.removeIf(isEven);
        System.out.println("list = " + list);

        List<Integer> list22 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3));

        list22.removeIf(n -> n % 2 != 0);
        System.out.println("list22 = " + list22);

        System.out.println("---------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);
        System.out.println("names = " + names);

        System.out.println("---------------------");
        System.out.println("----------Consumer-----------");
        // interface Consumer<T> void accept(T t);
        // if function takes one parameter and return void
        // Consumer can be used

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("--------------------");
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        /*
        for (Integer each : list2) {
            if(each %2 != 0){
                System.out.println(each);
            }
        }
        */
        System.out.println("list2");
        list2.forEach(p -> System.out.println(p));

        System.out.println();
        System.out.println("Odd numbers in list2");
        list2.forEach(p -> {
            if (p % 2 != 0) System.out.println(p);
        });

        System.out.println("--------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));
        // print initials

        employees.forEach(s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

        System.out.println("---------------------");
        System.out.println("----------Function-----------");
        // interface Function<T, R>   R apply(T t)

        System.out.println("---------------------");
        System.out.println("Ex. Converts int Array to List of Integer");

        // if the function takes a Type of variable and it returns Type of variable (parameter type and return variable type can be same or different)
// argument and return type could be any type
        // Function can be used
        //  takes int array returns Integer List
        Function<int[], List<Integer>> convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> intList = convertToList.apply(arr);
        System.out.println("intList = " + intList);

        System.out.println("---------------------");
        System.out.println("Ex. Converts List of Integer to int Array");

        Function<List<Integer>, int[]> convertToArray = (l) -> {
            int[] result = new int[l.size()];
            for (int i = 0; i < l.size(); i++) {
                result[i] = l.get(i);
            }
            return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int[] intArray = convertToArray.apply(numbers);

        System.out.println(Arrays.toString(intArray));

        // create a function that can return the maximum number from an int array
        Function<int[], Integer> maxOfArray = (a) -> {
            int max = 0;
            for (int each : a) {
                if (each > max) {
                    max = each;
                }
            }
            return max;
        };

        int[] numbers2 = {1, 2, -1, 55, 88, 104, 7};

        int maxNumber = maxOfArray.apply(numbers2);
        System.out.println("maxNumber = " + maxNumber);

        // create a function that can swap the first and last elements of an array
        Function<int[], int[]> swapFirstAndLast = (a) -> {
            int[] result = new int[a.length];
            result = a;
            int temp = a[0];
            result[0] = a[a.length - 1];
            result[result.length - 1] = temp;
            return result;
        };

        int[] numbers3 = {91, 1, 2, -1, 55, 88, 104, 7, 86};

        int[] numbers4 = swapFirstAndLast.apply(numbers3);

        System.out.println(Arrays.toString(numbers4));

        // Create a function that can reverse an array and returns it
        Function<int[], int[]> reverseArray = (a) -> {
            int[] result = new int[a.length];
            for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
                result[j] = a[i];
            }
            return result;
        };

        int[] numbers5 = {-1, 55, 88, 104, 7, 86, 75, 9};

        int[] numbers6 = reverseArray.apply(numbers5);

        System.out.println(Arrays.toString(numbers6));
        // create a function that can reverse a List
        Function<List<Integer>, List<Integer>> reverseList = (l) -> {
            List<Integer> result = new ArrayList<>();

            for (int i = 0, j = l.size() - 1; i <= l.size() - 1; i++, j--) {
                result.add(l.get(j));
            }
            return result;
        };

        List<Integer> numbers7 = new ArrayList<>();
        numbers7.addAll(Arrays.asList(-1, 55, 88, 104, 7, 86, 75, 9));

        List<Integer> number8 = reverseList.apply(numbers7);
        System.out.println("number8 = " + number8);
    }
}
