package from_Short_Videos;

import java.util.Arrays;

public class Array_Multidimensional {
    public static void main(String[] args) {

        int[][] array2D = new int[3][]; // 3 one-dimensional arrays

        int[][] array2Da = {{1, 2}, {2, 3, 4}, {6, 7, 8, 9}};
        //                     0        1           2

        System.out.println("array2Da[1][2] = " + array2Da[1][2]); // array2Da[1][2] = 4

        System.out.println("-----------------------");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        int[] arr3 = {6, 7, 8, 9};


        int[][] arr2Da = new int[3][];
        arr2Da[0] = arr1;
        arr2Da[1] = arr2;
        arr2Da[2] = arr3;

        int[][] arr2Db = {arr1, arr2, arr3};

        int[][] arr2Dc = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        // Arrays.deepToString()

        System.out.println(Arrays.deepToString(arr2Dc)); // [[1, 2, 3], [4, 5], [6, 7, 8, 9]]

        System.out.println("arr2Dc[2][1] = " + arr2Dc[2][1]); // arr2Dc[2][1] = 7

    }
}
