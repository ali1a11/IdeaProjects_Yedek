package day_20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int numbers[] = {1, 2, 6, 8, 9, 7, -1, 0};

        System.out.println(Arrays.toString(numbers)); // [1, 2, 6, 8, 9, 7, -1, 0]

        Arrays.sort(numbers); // sorts the array in ascending order
        System.out.println(Arrays.toString(numbers)); // [-1, 0, 1, 2, 6, 7, 8, 9]

    }
}
