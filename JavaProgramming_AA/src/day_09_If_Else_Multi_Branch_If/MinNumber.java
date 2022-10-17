package day_09_If_Else_Multi_Branch_If;
/*
	1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */
public class MinNumber {
    public static void main(String[] args) {

        int n1 = 100,
                n2 = 200;
        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean equal = n1 == n2;

        if (n1IsMin) {
            System.out.println(n1 + " is the minimum number.");
        }

        if (n2IsMin) {
            System.out.println(n2 + " is the minimum number.");
        }

        if (equal) {
            System.out.println(n2 + " and " + n2 + " equal.");
        }
    }
}
