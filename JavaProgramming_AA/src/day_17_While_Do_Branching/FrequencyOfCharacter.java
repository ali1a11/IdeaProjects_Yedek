package day_17_While_Do_Branching;
/*
	1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AAABBBC";
        char ch = 'A';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (eachChar==ch){
                frequency +=1;
            }
        }
        System.out.println("frequency = " + frequency);

    }
}
