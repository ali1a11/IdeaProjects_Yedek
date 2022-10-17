package week09_03_07_2022;

import java.util.Arrays;

public class Reverse2DArray3AA {
    public static void main(String[] args) {

        int[] arr1D_1 = {2, 5};
        int[] arr1D_2 = {9, 2, 1, 0};
        int[] arr1D_3 = {1, 3, 8};

        int[][] arr2D = {arr1D_1, arr1D_2, arr1D_3};

        System.out.println("arr2D: " + Arrays.deepToString(arr2D));
        
        int[][] reversed2DArray = new int[arr2D.length][];

        int indexFor2Darr = 0;
        for (int i = arr2D.length - 1; i >= 0; i--) {
            int[] reversed1Darr = new int[arr2D[i].length];
            
            int indexFor1Darr = 0;
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                reversed1Darr[indexFor1Darr] = arr2D[i][j];
                indexFor1Darr++;
            }
            reversed2DArray[indexFor2Darr] = reversed1Darr;
            indexFor2Darr++;
        }

        System.out.println("--------------");
        System.out.println("reversed2DArray: " + Arrays.deepToString(reversed2DArray));

    }
}
