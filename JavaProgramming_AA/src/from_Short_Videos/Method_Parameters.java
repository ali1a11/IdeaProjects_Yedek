package from_Short_Videos;

public class Method_Parameters {
    public static void main(String[] args) {
        displayValue(788);

        eligibleToVote(45, false);

        oddOrEven(8);
    }

    public static void displayValue(int num) {
        System.out.println("Value is " + num);
    }

    public static void eligibleToVote(int age, boolean isUSCitizen) {
        if (age >= 18 && isUSCitizen) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
