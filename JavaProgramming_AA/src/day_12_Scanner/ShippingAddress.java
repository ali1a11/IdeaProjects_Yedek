package day_12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your full name: "); //nextLine()
        String fullName = scanner.nextLine();

        System.out.println("Enter your building number: "); //next()
        String buildingNumber = scanner.next();

        scanner.nextLine(); //dummy input

        System.out.println("Enter your street name: "); // nextLine()
        String streetName = scanner.nextLine();

        System.out.println("Enter your city name: ");  // nextLine()
        String cityName = scanner.nextLine();

        System.out.println("Enter your sate: "); // next()
        String state = scanner.next();

        System.out.println("Enter your zipcode"); // next()
        String zipcode = scanner.next();

        scanner.nextLine(); //dummy input

        System.out.println("Enter your country name: ");  // nextLine()
        String countryName = scanner.nextLine();

        System.out.println("Shipping address: " +fullName + "\n" + buildingNumber + " " + streetName +"\n" + cityName + " " + state + " " + zipcode + " " + countryName);

        scanner.close();
    }
}
