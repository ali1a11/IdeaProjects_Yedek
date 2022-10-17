package day_07_Operators;
/*
   2. create a class named LeapYear, and write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true

        Hint: if the number of year can be evenly divisible by 4 (with remainder of zero), it's leap year
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = Integer.valueOf(scanner.nextLine());

        boolean isLeapYear = year % 4 == 0;

        System.out.println(year + " is a leap year: " + isLeapYear);

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year: " + (year % 4 == 0));
        }
        else {
            System.out.println(year + " is a leap year: " + (year % 4 == 0));
        }

    }
}
