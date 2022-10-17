package day_16_for_loop_String_Practice;

public class Palindrome {
    public static void main(String[] args) {

        String word ="Level";
        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {

            reversed += word.charAt(i);
        }

        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);

        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);




    }
}
