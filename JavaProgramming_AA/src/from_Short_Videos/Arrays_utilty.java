package from_Short_Videos;
//        toString()
//        sort()
//        equals()
//        copyOf()
//        copyOfRange()

import java.util.Arrays;

public class Arrays_utilty {
    public static void main(String[] args) {
        // toString(): converts array object to string, return String
        String[] names = {"John", "Smith", "Shay", "Breanna", "Josh"};
        System.out.println(Arrays.toString(names));


        System.out.println("-----------------------------------------");
        // sort(): sorts the array in ascending order
        int[] numbers = {5, 1, 6, 3, 8, 4, 9, 7};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers)); // [1, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("-----------------------------------------");
        // equals(): compares two array objects if they have same elements in same order
        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'a', 'c', 'b'};
        char[] arr3 = {'a', 'c', 'b'};

        boolean result = Arrays.equals(arr1,arr2);
        System.out.println("result = " + result); // result = false

        boolean result2 = Arrays.equals(arr2, arr3);
        System.out.println("result2 = " + result2); // result2 = true

        // to check whether two arrays have same elements, we can first sort then use Arrays.equals() method

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result3 = Arrays.equals(arr1,arr2);
        System.out.println("result3 = " + result3); // result3 = true

        System.out.println("-----------------------------------------");
        // copyOf(array, newLength): copies the specified array elements and sets new length, returns new array
        int[] scores = {2, 5, 8, 6, 3, 7};
        int[] scores2 = Arrays.copyOf(scores, 9);

        System.out.println(Arrays.toString(scores2)); //[2, 5, 8, 6, 3, 7, 0, 0, 0]

        int[] scores3 = Arrays.copyOf(scores, 3);

        System.out.println(Arrays.toString(scores3)); //[2, 5, 8]


        System.out.println("-----------------------------------------");
        // copyOfRange(array, beIndex, endIndex): copies the specified range of the array, returns new array

        char[] elements = {'A', 'B', 'C', 'D', 'E', 'F'};
        // index            0    1    2    3    4    5

        char[] someElements = Arrays.copyOfRange(elements, 1, 4);

        System.out.println(Arrays.toString(someElements)); // [B, C, D]

    }
}
