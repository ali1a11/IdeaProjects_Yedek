package day_27_WrapperClasses;
/*
	2. RecplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};

				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


		2.2 Create the same functions for double arrays, char arrays, and String arrays
 */

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 5, 1, 3, 9};

        arr1 = replaceAll(arr1, 1, 88);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"Jack", "John", "Jack", "Mary"};
        arr2 = replaceAll(arr2, "Jack", "Geaorge");
        System.out.println(Arrays.toString(arr2));

    }

    // replaces all the matching old values of the array with the given value
    public static int[] replaceAll (int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values of the array with the given value
    public static double[] replaceAll (double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values of the array with the given value
    public static char[] replaceAll (char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    // replaces all the matching old values of the array with the given value
    public static String[] replaceAll (String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }



}
