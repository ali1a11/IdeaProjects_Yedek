package day_08_Logical_Operators;

public class GradeReport {
    public static void main(String[] args) {
        /*
        System.out.println(true == !false); //true
        System.out.println(!true != false); // false
        System.out.println(!false == true); // true

        System.out.println(!! false); //false
        System.out.println(!!!false); //true
        */


        /*

        0 - 100
        90-100 excelent A
        80-89 great B
        70-79 good C
        60-69 passed
        0-59 failed

         */
        int score = 55;
        boolean A = score >= 90 && score <= 100;
        boolean B = score >= 80 && score < 90; //boolean B = score >=80 && score !=A; if score not A and bıgger or equal to 80
        boolean C = score >= 70 && score < 80; // boolean C = score >=70 && (!A && !B);
        boolean D = score >= 60 && score < 70; // boolean D = score >=60 && (!A && !B && !C);
        boolean F = score >= 0 && score < 60; // boolean F = (!A && !B && !C && !D);

        if (A) {
            System.out.println("Excellent");
        }
        if (B) {
            System.out.println("Great");
        }

        if (C) {
            System.out.println("Good");
        }

        if (D) {
            System.out.println("Passed");
        }

        if (F) {
            System.out.println("Failed");
        }


    }
}
