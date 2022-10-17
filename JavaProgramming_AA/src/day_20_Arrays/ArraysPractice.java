package day_20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 50, 70};

        System.out.println(Arrays.toString(numbers));

        //create a variable that can contain 5 scores
        int [] scores = new int[5];

        scores[0] = 65;
        scores[1] = 85;
        scores[2] = 55;
        scores[3] = 75;

        scores[scores.length-1] = 95; //scores[4] = 95; //scores.length Array eleman sayisini verir

        System.out.println(Arrays.toString(scores));


    }
}
