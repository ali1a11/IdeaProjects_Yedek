package deneme.D4;

import java.util.*;

class ZombiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};



        //TODO. Write you code below this line.

        int day = 0;
        int[] cityList = {0, 0, 0, 0, 0, 0, 0, 0};

        while (true) {

            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[i] == 0) {
                    cityList[i] = 1;
                }
            }

            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
            int total = 0;
            for (int each : inhabitants) {
                total += each;
            }
            if (total == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }

            for (int i = 0; i < inhabitants.length; i++) {
                if (cityList[i] == 1) {
                    if ((i - 1) >= 0) {
                        inhabitants[i - 1] /= 2;
                    }
                    if ((i + 1) <= inhabitants.length - 1)
                        inhabitants[i + 1] /= 2;
                }
            }
        }
    }
}

