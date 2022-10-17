package day_13_String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Person";

        char thirdChar = word.charAt(2);

        System.out.println("Third Char = " + thirdChar);

        char lastChar = word.charAt(word.length()-1);

        System.out.println("Last Char = " + lastChar);
        
        String s1 = "Have a nice day.";
        
        int l1 = s1.length();

        System.out.println("l1 = " + l1);

        String words ="asda";
        String[] array = words.split(" ");
        System.out.println(Arrays.toString(array));

    }
}
