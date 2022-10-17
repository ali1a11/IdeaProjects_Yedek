package day_08_Logical_Operators;
/*
    2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 65;

        boolean divisibleBy2 = 65 % 2 == 0;
        boolean divisibleBy3 = 65 % 3 == 0;
        boolean dıvısıbleBy5 = 65 % 5 == 0;

        System.out.println(number + " is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibleBy3);
        System.out.println(number + " is divisible by 5: " + dıvısıbleBy5);
    }
}
