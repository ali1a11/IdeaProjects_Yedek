package day_15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers2 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number: ");
            int number = new Scanner(System.in).nextInt();
            sum += number;
        }

        System.out.println("sum = " + sum);


    }
}
