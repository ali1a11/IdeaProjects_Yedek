package day_21_Arrays_Utility_for_Each_Loop;

public class MaximumNumber {
    public static void main(String[] args) {

/*
 int[] numbers = {10, 2, 5, 4, 20, 1, -3};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) { // shortcut for this loop numbers.fori
            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        System.out.println("max = " + max);
 */

        int[] numbers = {10, 2, 5, 4, 20, 1, -3};
        int max = numbers[0];

        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println((max));

    }
}
