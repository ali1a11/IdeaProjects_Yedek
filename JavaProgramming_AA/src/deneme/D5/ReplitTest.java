package deneme.D5;

import java.util.Scanner;

public class ReplitTest {
    public static String mergeStrings(String one, String two) {
//
        char[] oneChar = one.toCharArray();
        char[] twoChar = two.toCharArray();

        String merged = "";

        int minLength = one.length(); //assumption

        if (two.length()<minLength){
            minLength = two.length();
        }

        for (int i =0; i < minLength ; i++){
            merged += "" + oneChar[i];
            merged += "" + twoChar[i];
        }

        if (one.length()>two.length()) {
            merged += one.substring(two.length());
        } else if (two.length()>one.length()) {
            merged += two.substring(one.length());
        }

        return merged;
//
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

}