package day_42_Exceptions_Continue;
/*
Warmup task:
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */

public class MorningWorkOut {
    public static void main(String[] args) {
        System.out.println("------------Push up is started-------------------");


        for (int i = 1; i <= 30; i++) {

            System.out.print("\rPush up " + i); // "\r escape sequence prints sameline every time
            sleep(1.5);
           /*
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            */

        }

        System.out.println();
        System.out.println("------------Push up is completed-------------------");

        System.out.println("------------Pull up is started-------------------");


        for (int i = 1; i <= 20; i++) {

            System.out.print("\rPush up " + i); // "\r escape sequence prints sameline every time
            sleep(2.5);
           /*
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            */
        }

        System.out.println();
        System.out.println("------------Pull up is completed-------------------");


    }

    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
