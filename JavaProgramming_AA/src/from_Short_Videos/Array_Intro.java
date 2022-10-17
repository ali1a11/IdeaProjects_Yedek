package from_Short_Videos;

import java.util.Arrays;

public class Array_Intro {
    public static void main(String[] args) {

        // create an array that can have 5 integers
        int[] numbers = new int[5];

        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]

        numbers[0] = 9;
        numbers[1] = 8;
        numbers[2] = -1;
        numbers[3] = 7;
        numbers[4] = 1;

        System.out.println(Arrays.toString(numbers)); // [9, 8, -1, 7, 1]

        System.out.println("-----------------------------------");

        // create an array that has yellow, red, white, blue, green, black

        String[] colors = {"red", "white", "blue", "green", "black"};

        System.out.println("colors.length = " + colors.length);

        System.out.println("Arrays.toString(colors) = " + Arrays.toString(colors));


    }
}
