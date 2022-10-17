package day_27_WrapperClasses.Tasks;
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
 */

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] intArr1 = {10, 20, 30, 40, 50};
        int[] intArr2 = swap(intArr1,1, 4);
        System.out.println(Arrays.toString(intArr2));

        char[] charArr1 = {'a', 'b', 'c', 'd', 'e'};
        char[] charArr2 = swap(charArr1, 0, 3);
        System.out.println(Arrays.toString(charArr2));

        String[] strArr1 = {"Henry", "Hans", "Mike", "Tom", "John"};
        String[] strArr2 = swap(strArr1, 2, 0);
        System.out.println(Arrays.toString(strArr2));
    }

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
