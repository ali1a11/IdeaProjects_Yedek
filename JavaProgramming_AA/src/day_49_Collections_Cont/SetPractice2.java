package day_49_Collections_Cont;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        // Array -> Set -> Array

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);


       /*
        Set<String> set1 = new HashSet<>(Arrays.asList(arr)); // [Paper towels, Wooden Spoon, Book, Phone, Coke, Pen, Eggs, Milk]

        arr = set1.toArray(new String[0]); // converting Set to Array

        System.out.println("set1 = " + set1);

        */

        System.out.println("arr = " + Arrays.toString(arr));


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 50, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        // ArrayList -> Set -> ArrayList
        list = new ArrayList<>(new LinkedHashSet<>(list));

        //list2[] = new HashSet<Integer>(list).toArray(new Integer[0]);

        System.out.println("list = " + list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("dd", "aa", "bb", "c", "kk", "aa", "bb", "c", "e"));

        System.out.println("list2 = " + list2); // list2 = [dd, aa, bb, c, kk, aa, bb, c, e]

        list2 = new ArrayList<>(new TreeSet<>(list2));

        System.out.println("list2 = " + list2); // list2 = [aa, bb, c, dd, e, kk]


        System.out.println("---------------------------");
        Integer[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // return  the fifth element after removing the dublicates
        // do not change the order of the elements

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("------------------------");

        String str = "fffaaaabbbbbccccdddeee";

        String result = ""; //f3a4b5c4d3e3

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")), each);
            result += each + count;
        }

        System.out.println(result);

        System.out.println("----------------Collections.frequency()--------------");
        System.out.println("https://www.geeksforgeeks.org/java-util-collections-frequency-java/");
        ArrayList<String> wordlist =  new ArrayList<String>();
        wordlist.add("code");
        wordlist.add("code");
        wordlist.add("quiz");
        wordlist.add("code");

        // count the frequency of the word "code"
        System.out.println("The frequency of the word code is: "+
                Collections.frequency(wordlist, "code"));

        System.out.println("--------------------------");

        Set<String> names = new HashSet<>();
        names.addAll(Arrays.asList("John", "John", "Ahmet", "James", "Tom", "George", "Ahmet", "Ahmet"));

        // Set -> Array // to use Array index [2]
        System.out.println(names.toArray(new String[0])[2]);

        // Set -> ArrayList
        System.out.println(new ArrayList<>(names).get(2));

        System.out.println("--------------------------");

        for (String eachName : names) {
            System.out.println(eachName);
        }

        System.out.println("--------------------------");


    }
}
