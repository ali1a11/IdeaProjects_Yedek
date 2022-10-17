package day_26_Custom_Method_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement2 {

    public static void main(String[] args) {
        int[] intArray = {1, 5, 6, 9, 0, 5, 6, 8, 1, 2, 2, 8};
        System.out.println(Arrays.toString(intArray));
        intArray = removeElement(intArray, 0);
        System.out.println(Arrays.toString(intArray));
    }

    // removes element at the given index from int array
    public static int[] removeElement(int[] array, int index) {
        int[] result = {};

        for (int i = 0; i < array.length; i++) {
            if (index < 0 || index > array.length - 1) {
                System.out.println("Invalid index: " + index);
                System.exit(0);
            }

            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }
        }
        return result;
    }
}
