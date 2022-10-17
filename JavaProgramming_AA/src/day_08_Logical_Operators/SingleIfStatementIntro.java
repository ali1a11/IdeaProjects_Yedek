package day_08_Logical_Operators;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 300;

        boolean evenNumber = number % 2 == 0;
        if (evenNumber) {
            System.out.println(number + " is even.");
        }

        if (!evenNumber){
            System.out.println(number + " is odd.");
        }

        //if (number %2== 0){
        //     System.out.println(number + " is even.");
        //}

        //

        int n2 = 200;
        if (n2>0) {
            System.out.println(n2 + " is positive.");
        }

        if (n2<0) {
            System.out.println(n2 + " is negative.");
        }

        if (n2==0) {
            System.out.println(n2 + " is zero.");
        }

    }
}
