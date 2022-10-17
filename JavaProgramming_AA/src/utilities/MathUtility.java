package utilities;

public class MathUtility {

    // returns the sum of two integers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // returns the sum of two decimals
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    //-----------------------------------------

    // returns the subtraction of two integers
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    // returns the subtraction of two decimals
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }


    // returns the multiplication of two integers
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    // returns the multiplication of two decimals
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    //

    // return divison integer num1/num2
    public static double division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            System.exit(0);
        }
        return (double)num1 / num2;
    }

    // return divison decimal num1/num2
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            System.exit(0);
        }
        return num1 / num2;
    }

    // checks if an integer is even number, returns boolean
    public static boolean isEven (int num){
        if (num !=0 && num%2==0){
            return true;
        }
        return false;
    }

    // checks if an integer is odd number, returns boolean
    public static boolean isOdd (int num){
        if (num%2==0){
            return false;
        }
        return true;
    }

    // return the maximum number between two integers
    public static int max (int num1, int num2){
        if (num1>num2){
            return num1;
        }
        return num2;
    }

    // return the maximum number between two decimals
    public static double max (double num1, double num2){
        if (num1>num2){
            return num1;
        }
        return num2;
    }

    // return the minimum number between two integers
    public static int min (int num1, int num2){
        if (num1<num2){
            return num1;
        }
        return num2;
    }

    // return the minimum number between two decimals
    public static double min (double num1, double num2){
        if (num1<num2){
            return num1;
        }
        return num2;
    }

    // returns the square of an integer
    public static int square (int num){
        return num*num;
    }

    // returns the square of a decimal
    public static double square (double num){
        return num*num;
    }

    // returns the cube of an integer
    public static int cube (int num){
        return num*num*num;
    }

    // returns the cube of a decimal
    public static double cube (double num){
        return num*num*num;
    }


}
