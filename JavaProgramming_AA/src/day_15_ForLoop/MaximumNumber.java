package day_15_ForLoop;
// Find maximum number of entered five numbers

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int max =-2147483648; // minimum int in Java

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter an integer number: ");
            int number = new Scanner(System.in).nextInt();

            if (number>max){
                max = number;
            }
        }
        System.out.println("max = " + max);
    }
}
