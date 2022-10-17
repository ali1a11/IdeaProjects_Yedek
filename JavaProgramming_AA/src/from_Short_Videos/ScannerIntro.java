package from_Short_Videos;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");

        int intNumber = scanner.nextInt();

        System.out.print("Enter a decimal number: ");

        double doubleNumber = scanner.nextDouble();



        System.out.print("Enter a word: ");

        String word = scanner.next();

        System.out.println("You entered: ");
        System.out.println("Integer: " + intNumber);
        System.out.println("Decimal: " + doubleNumber);
        System.out.println("Word: " + word);


        // scanner.nextLine(); // dummy input

        System.out.print("Enter your score: (integer) ");
        int score = scanner.nextInt();

        scanner.nextLine(); // dummy input

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + " and your score is " + score);


    }
}
