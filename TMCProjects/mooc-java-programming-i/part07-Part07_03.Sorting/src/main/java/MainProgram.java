import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {-1, 3, 7, 9, 1, 2, 4, 0, -4};

        sort(numbers);

    }

    //
    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];
        for (int each : array) {
            if (each < smallest) {
                smallest = each;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

/* from mooc
    public static int indexOfSmallest(int[] array) {
        int placeOfSmallest = 0;

        int index = 0;
        while (index < array.length) {
            if (array[index] < array[placeOfSmallest]) {
                placeOfSmallest = index;
            }

            index = index + 1;
        }

        return placeOfSmallest;
    }
*/
/* Farkli bir yol
    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int[] newArray = new int[table.length - startIndex];

        for (int i = startIndex, j = 0; i < table.length; i++, j++) {
            newArray[j] = table[i];
        }
        return startIndex + indexOfSmallest(newArray);
    }
 */

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexOfSmallest = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    /* from mooc
      public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int placeOfSmallest = startIndex;

        int index = startIndex;
        while (index < array.length) {
            if (array[index] < array[placeOfSmallest]) {
                placeOfSmallest = index;
            }

            index = index + 1;
        }

        return placeOfSmallest;
    }
     */

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int j = indexOfSmallestFrom(array, i);
            swap(array, i, j);

            System.out.println(Arrays.toString(array));
        }
    }
    //
}
