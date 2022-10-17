package day_22_MultiDimensionalArray;
/*
12 11 10 9
8 7 6 5 4
3 2 1
 */

public class IteratingMultiDimensionalArray3 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12}};

        for (int i = arr2D.length - 1; i >= 0; i--) { // shortcut arr2D.forr

            for (int j = arr2D[i].length - 1; j >= 0; j--) { // shortcut arr2D[i].forr

                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
        }
    }
}
