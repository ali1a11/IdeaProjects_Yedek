package day_25_CustomMethods_Method_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

        int[] intArray = {1, 6, 7, 0, -1, 4, 3};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 5.6, 9.3, -3.5};
        Arrays.sort(doubleArray);

        char[] charArray = {'k', 'T', 'a', 'ø', 'U'};
        Arrays.sort(charArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(charArray));

        System.out.println("------------------");

        int sum = sumOfNumbers(6, 9);
        System.out.println("sum = " + sum);

        double sum2 = sumOfNumbers(6.1, 2.3);
        System.out.println("sum2 = " + sum2);

        double sum3 = sumOfNumbers(6.1, 2.3, -0.5);
        System.out.println("sum3 = " + sum3);
    }

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return sumOfNumbers(num1, num2) + num3; //return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return sumOfNumbers(num1, num2, num3) + num4; //return num1 + num2 + num3 +num4;
    }


}
