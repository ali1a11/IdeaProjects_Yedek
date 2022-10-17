package week09_03_07_2022;

import java.util.Arrays;

public class Reverse2DArray {
    public static void main(String[] args) {

        int[] arr1D_1 = {2, 5, 6, 3, 8, -1};
        int[] arr1D_2 = {9, 2, 1, 0, -5};
        int[] arr1D_3 = {1, 3, 8, 7, 0, 4, 5};

        int[][] arr2D_1 = {arr1D_1, arr1D_2, arr1D_3};

        System.out.println("arr2D_1: " + Arrays.deepToString(arr2D_1));

        System.out.println("arr2D_1.length: " + arr2D_1.length);

        int[][] reversed2Darr = new int[arr2D_1.length][]; // different size of 1D arrays

        int index2D = 0;
        for (int i = arr2D_1.length - 1; i >= 0; i--) {
            int[] reversed1Darr = new int[arr2D_1[i].length];

            int index1D = 0;
            for (int j = arr2D_1[i].length - 1; j >= 0; j--) {
                reversed1Darr[index1D] = arr2D_1[i][j];
                index1D++;
            }
            reversed2Darr[index2D] = reversed1Darr;
            index2D++;
        }

        System.out.println("-------------------");
        System.out.println("reversed2Darr: " + Arrays.deepToString(reversed2Darr));
    }
}
