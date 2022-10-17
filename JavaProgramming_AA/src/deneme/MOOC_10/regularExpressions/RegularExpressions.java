package deneme.MOOC_10.regularExpressions;

import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {

        // Alternation (Vertical Line)

        String string = "00";

        if (string.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }

        // Affecting Part of a String (Parentheses)
        String string2 = "cars";

        if (string2.matches("car(|s|)")) { // 0000(0|1)
            System.out.println("The string contained one of the alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }

        // Quantifiers
        // The quantifier * repeats 0 ... times,

        String string3 = "trolololololo";

        if (string3.matches("trolo(lo)*")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }
        System.out.println("------------------------------------");
        // Quantifiers
        // The quantifier + repeats 1 ... times,
        String string4 = "trolololololo";

        if (string4.matches("tro(lo)+")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println("------------------------------------");
        // Quantifiers
        // The quantifier ? repeats 0 or 1 times,
        String string5 = "You have to accidentally the whole meme";

        if (string5.matches("You have to accidentally (delete )?the whole meme")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println("------------------------------------");
        // Quantifiers
        // The quantifier {a} repeats a times
        String string6 = "1010";

        if (string6.matches("(10){2}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println("------------------------------------");
        // Quantifiers
        // The quantifier {a,b} repeats a ... b times, for example:
        String string7 = "1";

        if (string7.matches("1{2,4}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println("------------------------------------");
        // Quantifiers
        // The quantifier {a,} repeats a ... times
        String string8 = "11111";

        if (string8.matches("1{2,}")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        System.out.println("------------------------------------");
        boolean b = Pattern.matches("a*b", "aaaaab");
        System.out.println("b = " + b);


    }
}
