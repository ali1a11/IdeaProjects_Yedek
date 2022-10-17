package day_50_Collections_Cont;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        System.out.println("set = " + set); // set = [1, 2, 3, 4, 5]

        // Set -> Array
        Integer[] array = set.toArray(new Integer[0]);

        System.out.println("array = " + Arrays.toString(array)); // array = [1, 2, 3, 4, 5]

        // Set -> LIst
        List<Integer> list = new ArrayList<>(set);

        System.out.println("list = " + list); // list = [1, 2, 3, 4, 5]

        List<String> names = null;

        // System.out.println(names.size()); // .NullPointerException

        System.out.println("------------------------------------------");

        // Stack has pop() method
        // pop() -> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        System.out.println("chars = " + chars); // chars = [A, B, C, D]

        // Stack has pop() method but List has not. Therefore we are using downcasting

        ((Stack)chars).pop(); // Downcasting

        System.out.println("chars = " + chars); // chars = [A, B, C]

        System.out.println("------------------------------------------");

        // poll() -> FIFO
        // classes implementing Queue (PriorityQueue, LinkedList, ArrayDequeue) can use poll() method

        List<String> names2= new LinkedList<>();
        names2.addAll(Arrays.asList("James","Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println("names2 = " + names2);

        ((LinkedList<String>) names2).poll();

        System.out.println("names2 = " + names2);


    }
}
