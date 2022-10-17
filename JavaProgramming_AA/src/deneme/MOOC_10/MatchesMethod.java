package deneme.MOOC_10;


import java.util.Scanner;

public class MatchesMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide a student number: ");
        String number = scanner.nextLine();

        if (number.matches("01[0-1]{7}")) {
            System.out.println("Correct format.");
        } else {
            System.out.println("Incorrect format.");
        }
    }

}
