package from_Short_Videos.functionalInterface;

import java.util.function.Predicate;

public class PraticetePractice {
    public static void main(String[] args) {
/*
        Predicate<Integer> isEven = (x) -> {
            return x % 2 == 0;
        };
 */
        Predicate<Integer> isEven = x -> x % 2 == 0;

        boolean r1 = isEven.test(30);
        System.out.println("r1 = " + r1);

        Predicate<String> isPalindrome = (str) -> {
            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
/*
            if (str.equalsIgnoreCase(reversed)){
                return true;
            } else {
                return false;
            }

 */
            return str.equalsIgnoreCase(reversed);
        };

        System.out.println("isPalindrome.test(\"Anna\") = " + isPalindrome.test("Anna")); // isPalindrome.test("Anna") = true


    }
}
