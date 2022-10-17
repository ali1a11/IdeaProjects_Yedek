package day_21_Arrays_Utility_for_Each_Loop;

//toCharArray()

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";

        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each : chars){
            System.out.println(each);
        }
    }
}
