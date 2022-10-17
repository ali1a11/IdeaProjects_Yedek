package day_25_CustomMethods_Method_Overloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        //StringUtility.printEachChar(str);

        String reversedStr = StringUtility.reverse(str);
        System.out.println(reversedStr);
        StringUtility.printEachChar(reversedStr);

        System.out.println("___________");

        String word = "Civic";

        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("___________");

        // How many palindrome name in the names array?
        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Hello", "Hei"};

        int count = 0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println("count = " + count);


    }
}
