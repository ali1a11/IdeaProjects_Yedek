package day_18_Nested_Loop;
/*
2. Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enters invalid answer, repeat the previous steps
 */

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();


            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }

            System.out.println("Would you like to enter another nember?");
            String answer = scan.next().toLowerCase();

            while(!(answer.equals("yes")||answer.equals("no"))){
                System.err.println("Please re-enter Would you like to enter another nember?");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("no")){
                break;
            }


        }


    }
}
