package week_15_14_08_2022;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {

        System.out.print("Enter a positive integer number: ");

        int x = 5;
        Scanner scanner = new Scanner(System.in);
        try {

            int y = scanner.nextInt();
            System.out.println("x/y = " + ((double)x/y));

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        System.out.println("After x/y operation");

    }
}
