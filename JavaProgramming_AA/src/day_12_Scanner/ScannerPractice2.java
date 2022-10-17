package day_12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Enter true or false: ");
        //boolean result =input.nextBoolean(); // only true or false input

        System.out.println("Enter your name: ");
        String name = input.next(); //read the input until a pace
        input.close();
        System.out.println("name = " + name);

    }
}
