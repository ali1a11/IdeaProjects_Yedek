package from_Short_Videos;

// Collections: Utility class of the Collection.
//              presented in java.util package
//methods:
// sort(list): sorts the list in ascending order
// max(list): returns the max number
// min(list): returns the min number
// reverse(list): reverses the list
// swap(list, index1, index2): swaps the elements at the given indexes
// frequency(list, element): returns the frequency of the element from the list


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100, 200, 50, 10, 20, 30, 40, 50, 60, 70));

        // sort(list): sorts the list in ascending order
        Collections.sort(numbers);

        System.out.println("numbers = " + numbers);
        System.out.println("----------------------------");
        // max(list): returns the max number
        // min(list): returns the min number
        Integer max = Collections.max(numbers);
        Integer min = Collections.min(numbers);

        System.out.println("max = " + max); // max = 200
        System.out.println("min = " + min); // min = 10

        System.out.println("----------------------------");
        // reverse(list): reverses the list
        Collections.reverse(numbers);

        System.out.println("numbers = " + numbers); // numbers = [200, 100, 70, 60, 50, 50, 40, 30, 20, 10]

        System.out.println("----------------------------");
        // swap(list, index1, index2): swaps the elements at the given indexes
        Collections.swap(numbers, 1, 2);

        System.out.println("numbers = " + numbers);

        Collections.swap(numbers, 0, numbers.size()-1);

        System.out.println("numbers = " + numbers);

        System.out.println("----------------------------");
        // frequency(list, element): returns the frequency of the element from the list
        numbers.addAll(Arrays.asList(50,50,50));

        System.out.println("Collections.frequency(numbers, 50) = " + Collections.frequency(numbers, 50));


    }
}
