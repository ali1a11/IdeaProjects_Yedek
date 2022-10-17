package day_20_Arrays;

import java.util.Arrays;

public class ArraysMonth {
    public static void main(String[] args) {

        String months [] = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};



        for (int i = 0; i < months.length; i++) {

            System.out.println(months[i]);
        }

        System.out.println("-----");

        for (int i = months.length-1; i >=0 ; i--) {

            System.out.println(months[i]);
        }


        System.out.println(Arrays.toString(months));

    }
}
