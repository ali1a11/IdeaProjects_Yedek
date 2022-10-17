package deneme.MOOC7.GradeRegister;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {

            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }
                register.addPoints(input);
        }

        System.out.println(register);
        register.pointsAverage();
        register.getPassingPointsAverage();
        register.getPassPersantage();
        register.getGradeDistribution();
    }
}
