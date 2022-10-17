package utilities;

import java.util.Arrays;

public class StringUtility {

    // prints each character of the given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    // reverses the given string and returns the reversed string
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str) {
        return reverse(str).equalsIgnoreCase(str);
    }

    // checks if the given string is anagram, returns boolean
    public static boolean anagram(String str1, String str2) { // "abc", "bca"
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }

    // removes the dublicates from given string, return String // "aaaaabbbbbccccc" -> "abc"
    public static String removeDublicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;
    }

    //-----------------------
    // checks the given string if it is a strong password and returns boolean
    public static boolean isStrongPassword(String str) {
        boolean r1 = str.length() >= 8 && !str.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; // has lower case
        boolean r4 = false; // has special char
        boolean r5 = false; // has digit

        char[] chars = str.toCharArray();

        for (char each : chars) { // for checking each char
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r4 = true;
            } else { // special char
                r5 = true;
            }
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }


}
