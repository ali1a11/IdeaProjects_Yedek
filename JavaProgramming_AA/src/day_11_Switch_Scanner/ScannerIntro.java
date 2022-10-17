package day_11_Switch_Scanner;
import java.util.Locale;
import java.util.Scanner;


public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in).useLocale(Locale.US); //shortcut Scan + Enter to import java.util.Scanner;
            // in order to use decimal with using dot like 2.5    .useLocale(Locale.US);
/*
        System.out.println("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.println("num1 = " + num1);
*/

        System.out.println("Enter a decimal: ");
        double num2 = input.nextDouble(); // user enter with ,
        System.out.println("num2 = " + num2);



        //input.nextInt();
        //System.out.println(input.nextInt());
        
        input.close(); //closes the scanner. After this line you have to define Scanner object again in order to use input from user
    }
}
