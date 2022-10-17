package day_16_for_loop_String_Practice;

import java.util.Locale;

public class RemoveTheDublicate2 {
    public static void main(String[] args) {

        String str = "aabbaBaAcCcD";
        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {
            String ch = "" + str.charAt(i); //String concatenation

            if (!result.contains(ch.toLowerCase())){ //case insensitive
                result += ch.toLowerCase();
            }
        }

        System.out.println("result = " + result);


    }
}

