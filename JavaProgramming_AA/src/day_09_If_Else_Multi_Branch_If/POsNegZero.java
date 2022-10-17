package day_09_If_Else_Multi_Branch_If;

public class POsNegZero {
    public static void main(String[] args) {
        int n = 100;

        boolean positive = n> 0;
        boolean negative = n< 0;
        boolean zero = n==0;

        if (n > 0) {
            System.out.println("positive");

        } else if (n < 0) {
            System.out.println("negative");

        } else {
            System.out.println("zero");

        }

    }
}
