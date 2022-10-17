package day_26_Custom_Method_Practice;

import utilities.MathUtility;

public class TestMathUtility {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;

        double numD1 = 0.5;
        double numD2 = 6.8;

        double sum1 = MathUtility.sum(0.5, 6.8);
        System.out.println("sum1 = " + sum1);

        double subs = MathUtility.subtraction(0.5, 6.8);
        System.out.println("subs = " + subs);
        
        int subs1 = MathUtility.subtraction(88, 65);
        System.out.println("subs1 = " + subs1);
        
        double value = MathUtility.sum(4,9) + MathUtility.subtraction(0.5,6.3);
        System.out.println("value = " + value);

        int mult = MathUtility.multiplication(num1, num2);
        System.out.println("mult = " + mult);
        
        double mult2 = MathUtility.multiplication(numD1,numD2);
        System.out.println("mult2 = " + mult2);

        double div = MathUtility.division(2, 0.1);
        System.out.println("div = " + div);
        
        boolean a = MathUtility.isEven(9);
        System.out.println("a = " + a);

        boolean b = MathUtility.isOdd(8);
        System.out.println("b = " + b);

        double max = MathUtility.max(7,7.3);
        System.out.println("max = " + max);

        int min = MathUtility.min(num1, num2);
        System.out.println("min = " + min);
        
        double min2 = MathUtility.min(numD1, numD2);
        System.out.println("min2 = " + min2);
        
        double sq1 = MathUtility.square(0.5);
        System.out.println("sq1 = " + sq1);
        
        double cube = MathUtility.cube(0.2);
        System.out.println("cube = " + cube);
        
    }
}
