package week12_06_2022;

public class Fibonacci {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int third = 0;


        for (int i = 1; i < 10; i++) {


            System.out.println(third + " ");
            third = first+ second;
            first = second;
            second = third;

        }
        int num1 = 0;
        int num2 = 1;
        int sum;

        String serie = "" + num1 + " " + num2 + " ";

        for (int i = 2; i <10 ; i++) {
            sum = num1 + num2;
            serie += sum + " ";
            num1 = num2;
            num2 = sum;

        }
        System.out.println ("serie = " + serie);
        System.out.println("Final number in the serie is " + num2);










    }
}
