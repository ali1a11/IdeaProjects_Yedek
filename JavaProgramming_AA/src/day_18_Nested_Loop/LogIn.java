package day_18_Nested_Loop;
/*
2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userName = scan.next();

        System.out.println("Enter your password: ");
        String password = scan.next();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println(" Welcome. Successfully logged in ");

        } else {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username: ");
                userName = scan.next();

                System.out.println("Enter your password: ");
                password = scan.next();

                if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
                    System.out.println(" Welcome. Successfully loged in ");
                    break;
                }
            }

            if (!(userName.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked");
            }
        }


        scan.close();
    }
}
