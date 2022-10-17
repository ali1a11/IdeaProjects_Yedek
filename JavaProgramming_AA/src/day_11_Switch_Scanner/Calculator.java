package day_11_Switch_Scanner;
/*
Given two double variables n1, n2, and a char variable named operator.
use switch statement to calculate the result of n1 & n2 based on the given operator
valid operators are: -, +, *, /
 */

public class Calculator {
    public static void main(String[] args) {

        double n1 = 10.5,
                n2 = 25.6;
        double result = 0.0;
        char operator = '+';

        boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

        if (valid) {
            switch (operator) {
                case '+':
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case '-':
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case '*':
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                default: // /
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    break;
            }
        } else {
            System.out.println("invalid operator: " + operator);
        }

    }
}
