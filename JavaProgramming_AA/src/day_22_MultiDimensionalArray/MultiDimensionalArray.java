package day_22_MultiDimensionalArray;

/*
String[] group1 = {"John", "Jack", "James"};
String[] group2 = {"John", "Jack", "James"};
String[] group3 = {"John", "Jack", "James"};
 */

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[] group1 = {"John", "Jack", "James"};
        String[] group2 = {"Karen", "Mary", "Victor"};
        String[] group3 = {"David", "Adam", "Boris"};

        String[][] groups = new String [3][]; //index: 0, 1, 2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.toString(groups)); // toString() is for one dimensional arrays only

        System.out.println(Arrays.deepToString(groups)); //Arrays.deepToString() is for multi dimensional arrays
        //[[John, Jack, James], [Karen, Mary, Victor], [David, Adam, Boris]]

        /*
        {1, 2, 3}
        {4, 5, 6, 7}
        {8, 9, 10, 11, 12}
         */

     //index of elements: 0  1  2    0  1  2  3    0  1  2   3   4
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
     //index of arrays:      0            1                2

        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

        System.out.println(Arrays.toString(arr2D[1])); // [4, 5, 6, 7]

        System.out.println(arr2D[1][2]); // 6
    }
}
