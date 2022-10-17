package day_17_While_Do_Branching;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {

            if (i == 'F') {
                break; //Exits the loop
            }
            System.out.print(i + " ");
        }
            Scanner scan = new Scanner(System.in);

        ///
            while (true) {
                System.out.println("Enter a number: ");
                int num = scan.nextInt();

                if (num < 0) {
                    break;
                }
            }

    }
}
