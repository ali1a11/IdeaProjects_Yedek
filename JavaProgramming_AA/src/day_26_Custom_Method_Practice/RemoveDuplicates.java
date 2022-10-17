package day_26_Custom_Method_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1, 1, 2, 5, 6};

        int[] nonduplicated = removeDuplicates(arr1);

        System.out.println(Arrays.toString(nonduplicated));

    }


    // removes the duplicates in a given array and returns nonduplicated array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

        for (int i : array) {
             for (int each : array) {
                if (!ArraysUtility.contains(result, each)) {
                    result = ArraysUtility.addElement(result, each);
                }
            }
        }
        return result;
    }

    // removes the duplicates in a given array and returns nonduplicated array
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};

        for (double i : array) {
            for (double each : array) {
                if (!ArraysUtility.contains(result, each)) {
                    result = ArraysUtility.addElement(result, each);
                }
            }
        }
        return result;
    }

    // removes the duplicates in a given array and returns nonduplicated array
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};

        for (char i : array) {
            for (char each : array) {
                if (!ArraysUtility.contains(result, each)) {
                    result = ArraysUtility.addElement(result, each);
                }
            }
        }
        return result;
    }

    // removes the duplicates in a given array and returns nonduplicated array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};

        for (String i : array) {
            for (String each : array) {
                if (!ArraysUtility.contains(result, each)) {
                    result = ArraysUtility.addElement(result, each);
                }
            }
        }
        return result;
    }
    
    

}
