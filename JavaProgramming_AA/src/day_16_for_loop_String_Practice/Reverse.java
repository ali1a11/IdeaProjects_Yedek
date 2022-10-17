package day_16_for_loop_String_Practice;

/*
	1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String result =""; // for reresed version of str
        
        
        for(int i =str.length()-1; i>=0;i--){
            result += str.charAt(i);
        }
        System.out.println("result = " + result);
    }
}
