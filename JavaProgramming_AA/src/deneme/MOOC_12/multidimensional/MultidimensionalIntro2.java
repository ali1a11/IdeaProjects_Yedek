package deneme.MOOC_12.multidimensional;

import java.util.Arrays;

public class MultidimensionalIntro2 {
    public static void main(String[] args) {

        int[][] matrix = new int[2][3];


        matrix[0][0] = 1;
        matrix[0][1] = 5;
        matrix[0][2] = -4;
        matrix[1][0] = 3;
        matrix[1][1] = -7;
        matrix[1][2] = 7;

        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("rowSum = " + rowSum);

        }

        for (int i = 0; i < matrix[0].length; i++) {
            int columnSum = 0;

            for (int j = 0; j < matrix.length; j++) {
                columnSum += matrix[j][i];
            }
            System.out.println("columnSum = " + columnSum);

        }










    }
}
