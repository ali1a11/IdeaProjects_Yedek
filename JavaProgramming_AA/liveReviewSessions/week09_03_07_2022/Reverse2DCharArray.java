package week09_03_07_2022;

import java.util.Arrays;

public class Reverse2DCharArray {
    public static void main(String[] args) {
        char[] arr1D_c1 = {'a', 'b'};
        char[] arr1D_c2 = {'k', 'l', 'm', 'n'};
        char[] arr1D_c3 = {'X', 'Y', 'Z'};

        char[][] arr2Dc = {arr1D_c1, arr1D_c2, arr1D_c3};

        System.out.println("arr2Dc: " + Arrays.deepToString( arr2Dc));

        char[][] reversed2Darr = new char[arr2Dc.length][];


        int indexFor2Darr = 0;
        for (int i = arr2Dc.length - 1; i >= 0; i--) {

            char[] reversed1Darr = new char[arr2Dc[i].length];

            int indexFor1Darr = 0;
            for (int j = arr2Dc[i].length - 1; j >= 0; j--) {
                reversed1Darr[indexFor1Darr] = arr2Dc[i][j];
                indexFor1Darr++;
            }
            reversed2Darr[indexFor2Darr] = reversed1Darr;
            indexFor2Darr++;
        }

        System.out.println("---------");
        System.out.println("reversed2Darr: " + Arrays.deepToString(reversed2Darr));
    }
}
