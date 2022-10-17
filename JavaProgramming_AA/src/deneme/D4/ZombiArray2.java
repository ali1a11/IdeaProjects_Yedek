package deneme.D4;

import java.util.Arrays;
import java.util.Scanner;

public class ZombiArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.

        int day = 0;

        while (true) {
            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));

            int totalInhabitants = 0;

            for (int each : inhabitants) {
                totalInhabitants += each;
            }

            if (totalInhabitants == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }

            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
            }
        }
    }
}