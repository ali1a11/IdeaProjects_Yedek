package day_27_WrapperClasses.Tasks;

/*
	1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] arr2 = insert(arr, 5, 100); //==> {10, 20, 100, 30, 40, 50}
        System.out.println(Arrays.toString(arr2));

        char[] charArr = {'a', 'b', 'c'};
        char[] charArr2 = insert(charArr,1, 'X');
        System.out.println(Arrays.toString(charArr2));

        String[] strArr = {"Jack", "John", "Karen","Mary"};
        String[] strArr2 = insert(strArr, 2, "Tom");
        System.out.println(Arrays.toString(strArr2));


    }

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



}
