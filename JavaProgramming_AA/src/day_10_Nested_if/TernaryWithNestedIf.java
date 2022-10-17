package day_10_Nested_if;

public class TernaryWithNestedIf {

    public static void main(String[] args) {

        int score = 95;
        /*
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Score is not valid");
        }
        */

        String result = (score >= 0 && score <= 100) ? (score >= 60) ? "Passed" : "Failed" : "Score is not valid";

        System.out.println(result);

    }
}