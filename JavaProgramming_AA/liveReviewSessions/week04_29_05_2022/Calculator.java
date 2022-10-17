package week04_29_05_2022;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator = 'a';
        double result = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two double type numbers: ");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Operation (+ - * /):");
        operator = scan.next().charAt(0); // to get char with scanner we use String manipulation

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                if (num1 > num2) {
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (num2 > num1) {
                    System.out.println(num2 + " - " + num1 + " = " + (num2 - num1));
                } else {
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                }
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':

                if (num1 == 0 && num2 == 0) {
                    System.out.println("chose at least one nonzero number");
                    break;
                } else if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    System.out.println(num2 + " / " + num1 + " = " + (num2 / num1));
                    break;
                } else if (num1 == 0) {
                    System.out.println("Cannot divide by zero");
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    System.out.println(num2 + " / " + num1 + " = " + (num2 / num1));
                }
                break;
            default:
                System.out.println("Wrong operator");
                break;
        }
    }
}
