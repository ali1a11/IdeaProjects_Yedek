package day_24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        // find the max number between 100 and 200

        int max = maxNumber(100, 200);

        System.out.println("max = " + max);

        // multiply the max number by 2

        int mult = max*2;

        System.out.println("mult = " + mult);

    }

    public static int maxNumber(int a, int b) {
        int result = 0;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
