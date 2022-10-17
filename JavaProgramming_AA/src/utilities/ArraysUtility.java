package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    // prints each double of a double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    // prints each char of a char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    // prints each string of a string array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    //-----------------------------------------------------------

    // returns the max number for integer array // can be used for loop or sort the array and pict the last element
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // returns the max number for double array // can be used for loop or sort the array and pict the last element
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //-----------------------------------------------------------

    // returns the min number for integer array // can be used for loop or sort the array and pict the last element
    public static int min(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[0];
    }

    // returns the min number for double array // can be used for loop or sort the array and pict the last element
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //-----------------------------------------------------------

    // checks if the given integer is contained in the given array, returns boolean contains (int[], int)
    public static boolean contains(int[] array, int element) {
        boolean result = false;

        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // checks if the given double is contained in the given array, returns boolean contains
    public static boolean contains(double[] array, double element) {
        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // checks if the given char is contained in the given array, returns boolean contains (int[], int)
    public static boolean contains(char[] array, char element) {
        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // checks if the given String is contained in the given array, returns boolean contains
    public static boolean contains(String[] array, String element) {
        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    //-----------------------------------------------------------

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;
        return result;
    }

    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element;
        return result;
    }

    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element;
        return result;
    }

    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element;
        return result;
    }

    //-----------------------------------------------------------

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }

    //-----------------------------------------------------------

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

    //-----------------------------------------------------------

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

    // removes element at the given index from double array
    public static double[] removeElement(double[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes element at the given index from char array
    public static char[] removeElement(char[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    // removes element at the given index from int array
    public static String[] removeElement(String[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //-----------------------------------------------------------

    // merges given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = addElement(result, each);
        }
        for (int each : arr2) {
            result = addElement(result, each);
        }
        return result;
    }

    /*
     public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }
     */
    
    // merges given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {}; //new int[arr1.length + arr2.length];

        int i = 0;

        for (double each : arr1) {
            result[i++] = each;
        }

        for (double each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    // merges given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {}; //new int[arr1.length + arr2.length];

        int i = 0;

        for (char each : arr1) {
            result[i++] = each;
        }

        for (char each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    // merges given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {}; //new int[arr1.length + arr2.length];

        int i = 0;

        for (String each : arr1) {
            result[i++] = each;
        }

        for (String each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    //-----------------------------------------------------------

    // reverses the given array, returns a new array
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // reverses the given array, returns a new array
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    //-----------------------------------------------------------

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

    //-----------------------------------------------------------

    // replaces an en element at given index with given element return to an array
    public static int[] replace (int[] array, int index, int newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index: " + index); // shortcur serr
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    // replaces an en element at given index with given element return to an array
    public static double[] replace (double[] array, int index, double newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index: " + index); // shortcur serr
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    // replaces an en element at given index with given element return to an array
    public static char[] replace (char[] array, int index, char newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index: " + index); // shortcur serr
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    // replaces an en element at given index with given element return to an array
    public static String[] replace (String[] array, int index, String newElement){

        if (index<0 || index > array.length-1){
            System.err.println("Invalid index: " + index); // shortcur serr
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //-----------------------------------------------------------

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

    //-----------------------------------------------------------

    // inserts the given element to the given index of the array and returns the new array
    public static int[] insert(int[] array, int index, int element) {
        if (index < 0 || index > array.length) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        int[] result = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        result[index] = element;

        for (int j = index; j < array.length; j++) {
            result[j + 1] = array[j];
        }
        return result;
    }

    // inserts the given element to the given index of the array and returns the new array
    public static double[] insert(double[] array, int index, double element) {
        if (index < 0 || index > array.length) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        double[] result = new double[array.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        result[index] = element;

        for (int j = index; j < array.length; j++) {
            result[j + 1] = array[j];
        }
        return result;
    }

    // inserts the given element to the given index of the array and returns the new array
    public static char[] insert(char[] array, int index, char element) {
        if (index < 0 || index > array.length) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        char[] result = new char[array.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        result[index] = element;

        for (int j = index; j < array.length; j++) {
            result[j + 1] = array[j];
        }
        return result;
    }

    // inserts the given element to the given index of the array and returns the new array
    public static String[] insert(String[] array, int index, String element) {
        if (index < 0 || index > array.length) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        String[] result = new String[array.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        result[index] = element;

        for (int j = index; j < array.length; j++) {
            result[j + 1] = array[j];
        }
        return result;
    }

    //-----------------------------------------------------------

    //swaps the element at index i with the element at index j, and returns the new array
    public static int[] swap (int[] array, int i, int j){
        if (i<0 || j<0 || i> array.length || j> array.length){
            System.err.println("Invalid index ");
            System.exit(0);
        }
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static double[] swap (double[] array, int i, int j){
        if (i<0 || j<0 || i> array.length || j> array.length){
            System.err.println("Invalid index ");
            System.exit(0);
        }
        double temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static char[] swap (char[] array, int i, int j){
        if (i<0 || j<0 || i> array.length || j> array.length){
            System.err.println("Invalid index ");
            System.exit(0);
        }
        char temp = ' ';
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }

    //swaps the element at index i with the element at index j, and returns the new array
    public static String[] swap (String[] array, int i, int j){
        if (i<0 || j<0 || i> array.length || j> array.length){
            System.err.println("Invalid index ");
            System.exit(0);
        }
        String temp = "";
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }





}
