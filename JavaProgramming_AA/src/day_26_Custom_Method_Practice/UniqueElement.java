package day_26_Custom_Method_Practice;


import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElement {

    public static void main(String[] args) {
        int[] intArray = {1, 5, 6, 9, 45, 5, 6, 8, 1, 2, 2, 8};
        int[] unique = uniqueElements(intArray);
        System.out.println(Arrays.toString(unique));

        double[] doubleArray = {0.1, 2.5, 0.5, -3.8, 0.1, 2.5};
        double[] uniqe2 = uniqueElements(doubleArray);
        System.out.println(Arrays.toString(uniqe2));

        char[] charArray = {'a', 'a', 'b', 'n', 'b', 'b', 'c', 'f'};
        char[] unique3 = uniqueElements(charArray);
        System.out.println(Arrays.toString(unique3));

        String[] names = {"Jack", "Karen", "John", "George", "John", "Karen", "Igor", "George", };
        String[] unique4 = uniqueElements(names);
        System.out.println(Arrays.toString(unique4));


    }

    // return unique elements in a array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // return unique elements in a array
    public static double[] uniqueElements(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // return unique elements in a array
    public static char[] uniqueElements(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // return unique elements in a array
    public static String[] uniqueElements(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }




}
