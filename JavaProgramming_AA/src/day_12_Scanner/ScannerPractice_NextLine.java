package day_12_Scanner;

import java.util.Scanner;

public class ScannerPractice_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //read the everything until enter

        System.out.println("Enter your programming language: ");
        String progLang = input.nextLine();


        System.out.println("What is you age? ");
        int age = input.nextInt();

        input.nextLine(); // dummy input takes Enter key
        // capture the Enter key that user pressed for nextInt();

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("progLang = " + progLang);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();


    }
}
