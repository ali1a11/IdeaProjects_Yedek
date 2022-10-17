package day_42_Exceptions_Continue;


import static utilities.Sleep.sleep;

public class Countdown {

    public static void main(String[] args) {

        System.out.println("Countdown");
        for (int i = 10; i >= 0; i--) {
            System.out.print("\r " + i);
            sleep(0.5);
        }

    }

}
