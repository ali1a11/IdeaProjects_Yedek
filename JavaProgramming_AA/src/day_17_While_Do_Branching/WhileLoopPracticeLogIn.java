package day_17_While_Do_Branching;
/*
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}
 */

import java.util.Scanner;

public class WhileLoopPracticeLogIn {
    public static void main(String[] args) {

        //username: "Cydeo";
        //password: "Cydeo123";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = scan.next();

        System.out.println("Enter your password: ");
        String password = scan.next();


        if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in Wellcome");
        } else {
            int attempt = 3;
            while (!(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0) { //while credentials are invalid, and user has attempts

                if (attempt==1){
                    System.out.println("This is your last chance");
                }

                System.out.println("Invalid username or password, please re-enter");
                System.out.println("Enter your username: ");
                userName = scan.next();

                System.out.println("Enter your password: ");
                password = scan.next();



                attempt--;

            }
            if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in Wellcome");
            } else {
                System.out.println("Your account is locked");
            }
        }


        scan.close();
    }
}
