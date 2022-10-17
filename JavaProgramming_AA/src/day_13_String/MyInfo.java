package day_13_String;
/*
	1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int) nextInt()
			2. Enter your gender (String- One word ONLY) next() + nextLine()
			3. Enter your full name (String- Multiple words) nextLine()
			4. Enter your phone number (long) nextLong()
			5. Enter your zip code (int) nextInt() +nextLine()
			6. Enter your School name (String- Can be Multiple words) nextLine()
			7. Enter your city name (String- Can be Multiple words) nextLine()
			8. Enter your state name (String- One word ONLY) next()
			9. Enter your building number (int) nextInt() + nextLine()
			10. Enter your street name nextLine()

		MAKE SURE USER CAN ENTER ALL THE INPUT

		Display all the inputs that user entered in following order in sperate lines:

			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode

			6. school name
 */

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();        //int age = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter your gender: ");
        String gender = scanner.next();
        scanner.nextLine(); //dummy input

        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine(); // before nextLine() if the previous scanner method is not nextLine() wee need to use scanner.nextLine();

        System.out.println("Enter your phone number: ");
        Long phoneNumber = scanner.nextLong();

        System.out.println("Enter your zip code: ");
        int zipCode = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your School name: ");
        String schoolName = scanner.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = scanner.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = scanner.next();

        System.out.println("Enter your building number: ");
        int buildingNumber = scanner.nextInt();
        scanner.nextLine(); //dummy input

        System.out.println("Enter your street name: ");
        String streetName = scanner.nextLine();

        System.out.println("Full Name = " + fullName);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
        System.out.println("Phone Number = " + phoneNumber);
        System.out.println("Address: ");
        System.out.println("\t\t" + buildingNumber + " " +streetName);
        System.out.println("\t\t" + cityName + ", " + stateName + " " + zipCode);
        System.out.println("School Name = " + schoolName);


        scanner.close();
    }
}
