package deneme.D2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }


        System.out.print("Program's maximum duration? : ");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram p : programs) {
            if (p.getDuration() <=maxDuration ) {
                System.out.println(p);
                // System.out.print(p.getName() + ", " + p.getDuration() + " minutes\n");
            }


        /*
        int maks = 0;
        for (TelevisionProgram p : programs) {
            if (maks < p.getDuration()) {
                maks = p.getDuration();
            }
            System.out.print("Duration: ");
            */
        }
    }
}
