package day_13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        char f1 = firstName.charAt(0);
        char l1 = lastName.charAt(0);

        String initial = f1 + "." + l1 + "."; //string concatenation or String initial = "" +f1 + l1;
        //String initial = "" + f1 + l1;

         System.out.println("initial = " + initial);

    }
}
