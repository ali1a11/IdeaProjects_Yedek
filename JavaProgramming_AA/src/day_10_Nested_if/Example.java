package day_10_Nested_if;

public class Example {
    public static void main(String[] args) {
        int number = 9;

        if (number >= 1 && number <= 7) {
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else {
            System.out.println("Invalid number");
        }
    }
}
