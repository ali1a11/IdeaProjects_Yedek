package day_19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }

            System.out.println("would you like to enter another number? (yes/no)");
            String answer = scan.next();

            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry. Program terminates");
                System.exit(0);
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you");
                break;
            }
        }
    }
}
