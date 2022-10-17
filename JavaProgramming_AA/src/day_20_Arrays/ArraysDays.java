package day_20_Arrays;

import java.util.Arrays;

public class ArraysDays {
    public static void main(String[] args) {
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        int number = 1;

        if (number < 1 || number > 7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

    }
}
