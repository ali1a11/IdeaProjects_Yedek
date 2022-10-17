package week_15_14_08_2022;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("Entered " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid value !!");
        } finally {
            scanner.close();
            System.out.println("Finally block always run except some conditions.");
        }
    }
}
