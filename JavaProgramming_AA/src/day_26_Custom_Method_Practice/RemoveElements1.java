package day_26_Custom_Method_Practice;
/*
2. Create a class named RemoveElements:
	2.1 Create a method that passes two parameters: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
			Ex:
				int[] arr = {10,20,30,40}
				removeElement(arr, 2) ==> {10, 20, 40}

	2.2 Create a method that passes two parameters: a double array and an integer index. the method removes the element at the given index of the array and returns the new array
	2.3 Create a method that passes two parameters: a char array and an integer index. the method removes the element at the given index of the array and returns the new array
	2.4 Create a method that passes two parameters: a String array and an integer index. the method removes the element at the given index of the array and returns the new array
 */

import java.util.Arrays;

public class RemoveElements1 {
    public static void main(String[] args) {
        int[] intArray = {1, 5, 6, 9, 0, 5, 6, 8, 1, 2, 2, 8};
        System.out.println(Arrays.toString(intArray));
        intArray = removeElement(intArray, 0);

        System.out.println(Arrays.toString(intArray));

        intArray = removeElement(intArray, 0);
        System.out.println(Arrays.toString(intArray));
    }

    // removes element at the given index from int array
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }
}
