package day_16_for_loop_String_Practice;
/*
	2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */


public class RemoveTheDublicate {
    public static void main(String[] args) {

        String str = "aabbaaAcc";
        String result = "";

        for (int i = 0; i < str.length() - 1; i++) {
            String ch = "" + str.charAt(i); //String concatenation

            if (!result.contains(ch)) {
                result += ch;
            }
        }
        System.out.println("result = " + result);
    }
}
