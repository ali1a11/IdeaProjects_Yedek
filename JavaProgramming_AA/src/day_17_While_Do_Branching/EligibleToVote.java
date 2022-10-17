package day_17_While_Do_Branching;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        while (!(age >= 1 && age <= 120)) {
            System.out.println("Invalid entry. please re-enter");
            System.out.println("Enter your age: ");
            age = scan.nextInt();
        }

        System.out.println("are you a US citizen? yes/no ");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes")|| answer.equals("no"))){
            System.out.println("Invalid entry. please re-enter");
            System.out.println("are you a US citizen? yes/no ");
            answer = scan.next().toLowerCase();
        }
        if (age>= 18 && answer.equals("yes")){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
