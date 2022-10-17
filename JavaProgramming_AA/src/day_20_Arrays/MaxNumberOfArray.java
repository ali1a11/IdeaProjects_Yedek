package day_20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 2, 5, 4, 20, 1, -3};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) { // shortcut for this loop numbers.fori
            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println("max = " + max);

    }
}
