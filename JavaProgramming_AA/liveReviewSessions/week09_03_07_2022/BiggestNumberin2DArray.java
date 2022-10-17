package week09_03_07_2022;

import java.util.Arrays;

public class BiggestNumberin2DArray {
    public static void main(String[] args) {

        int[] arr1D_1 = {2, 5, 6, 3, 8, -1};
        int[] arr1D_2 = {9, 2, 1, 0, -5};
        int[] arr1D_3 = {1, 3, 8, 7, 0, 4, 5};

        int [][] arr2D_1 = {arr1D_1, arr1D_2, arr1D_3};

        /*
        find max numbers of each 1D array and store them inside another 1D array
         */

        int[] biggestNumbers = new int[arr2D_1.length]; // 3

        for (int i = 0; i < arr2D_1.length; i++) {
            //System.out.println(Arrays.toString(arr2D_1[i])); // for 2D deepToString

            int max = arr2D_1[i][0]; //assumption

            for (int each : arr2D_1[i]) {
                if (each>max) {
                    max = each;
                }
            }
            biggestNumbers[i] = max;
        }
        System.out.println(Arrays.toString(biggestNumbers));
    }
}
