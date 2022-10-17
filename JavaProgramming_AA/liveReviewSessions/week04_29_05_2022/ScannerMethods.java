package week04_29_05_2022;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {

        int x =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = scanner.nextInt();

        System.out.println("Enter y: ");
        int y = scanner.nextInt();

        int sum = x + y;
        System.out.println("sum = " + sum);

    }
}
