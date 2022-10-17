package day_10_Nested_if;


public class TernariesExample3 {
    public static void main(String[] args) {

        int number = 5;
        /*
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        */
        String result = (number > 0) ? "positive": (number < 0) ? "negative" : "zero";
        System.out.println(result);
    }
}