package deneme.MOOC_12.multidimensional;


import java.util.Arrays;

public class MultidimensionalIntro {
    public static void main(String[] args) {

        int rows = 2;
        int columns = 3;
        int[][] twoDimensionalArray = new int[rows][columns];

        System.out.println("row, column, value");
        for (int row = 0; row < twoDimensionalArray.length; row++) {

            for (int column = 0; column < twoDimensionalArray[row].length; column++) {
                int value = twoDimensionalArray[row][column];
                System.out.println("" + row + ", " + column + ", " + value);
            }
        }

        System.out.println(Arrays.deepToString(twoDimensionalArray));


        String[][] twoDimensionalStringArray = new String[4][2];

        for (int i = 0; i < twoDimensionalStringArray.length; i++) {

            for (int j = 0; j < twoDimensionalStringArray[i].length; j++) {
                String cell = twoDimensionalStringArray[i][j];
                System.out.println(i + " " + j + " " + cell);
            }

        }





    }
}
