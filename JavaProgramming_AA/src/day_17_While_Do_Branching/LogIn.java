package day_17_While_Do_Branching;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = scan.next();

        System.out.println("Enter your password: ");
        String password = scan.next();

        for (int i = 1; i <=3 ; i++) {

            if(userName.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in Wellcome");
                break;
            } else {
                System.out.println("Invalid username or password, please re-enter");
                System.out.println("Enter your username: ");
                userName = scan.next();

                System.out.println("Enter your password: ");
                password = scan.next();


            }

            if(i == 3) {
                System.out.println("Your account is locked");
            }

        }


    }
}
