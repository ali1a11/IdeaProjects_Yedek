package day_12_Scanner;

import java.util.Scanner;

//import java.util.* ; //wild import import everything under util

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a number between 1 to 7: ");
        int number = scan.nextInt();
        String result = "";

        if (number >= 1 && number <= 7) {
            result = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" :
                    (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";

        } else {
            result = "invalid number";
        }

        System.out.println(result);
        scan.close(); // clossing scan object
    }
}
