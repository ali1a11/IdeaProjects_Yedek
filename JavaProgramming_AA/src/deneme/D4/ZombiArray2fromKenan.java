package deneme.D4;

import java.util.Arrays;
import java.util.Scanner;

public class ZombiArray2fromKenan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int sum = 0;
        int day = 0;
        int[] cityList = {0, 0, 0, 0, 0, 0, 0, 0};
        boolean isAlive = true;

        while (isAlive) {
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;
            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] == 0) {
                    cityList[i] = 1;
                }
            }
            for (int i = 0; i < cityList.length; i++) {
                if (cityList[i] == 1) {
                    if (i - 1 >= 0) {
                        inhabitants[i - 1] /= 2;
                    }
                    if (i + 1 <= inhabitants.length - 1) {
                        inhabitants[i + 1] /= 2;
                    }
                }
            }
            sum = inhabitants[0] + inhabitants[1] + inhabitants[2] + inhabitants[4] + inhabitants[5] + inhabitants[6] + inhabitants[7];
            if (sum == 0) {
                isAlive = false;
                System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
                System.out.println("---- EXTINCT ----");

            }
            sum = 0;
        }


    }
}

