package day_12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); //dummy input takes Enter

        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Enter your GPA: ");
        double GPA = scanner.nextDouble();

        scanner.nextLine(); //dummy input takes Enter

        System.out.println("Enter your school name: ");
        String schoolName = scanner.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("GPA = " + GPA);
        System.out.println("schoolName = " + schoolName);
        scanner.close();

    }
}
