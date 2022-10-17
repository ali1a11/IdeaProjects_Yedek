package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxNumbersOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Please enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + " :");
            numbers[i] = scan.nextInt();

            if (i == numbers.length - 1) {
                System.out.println("Thank you");
            }
        }
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Numbers entered: " + Arrays.toString(numbers));
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}

