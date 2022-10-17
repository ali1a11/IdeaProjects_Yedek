package day_15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        int min = 2147483647; // maximum int in Java

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter an integer number: ");
            int number = new Scanner(System.in).nextInt();

            if (number < min) {
                min = number;
            }

            System.out.println("min = " + min);
        }


    }
}
