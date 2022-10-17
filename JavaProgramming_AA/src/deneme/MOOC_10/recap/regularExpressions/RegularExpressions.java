package deneme.MOOC_10.recap.regularExpressions;


import java.util.Scanner;

public class RegularExpressions {
    public static void main(String[] args) {

        /*
        A student number should begin with "01" followed by 7 digits between 0–9.
        For the student number, the appropriate regular expression is "01[0-9]{7}",
        and checking the student number entered by a user is done as follows:
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide a student number: ");
        // String number = scanner.nextLine();
        String number = "011234567";

        if (number.matches("01[0-9]{7}")) {
            System.out.println("Correct format.");
        } else {
            System.out.println("Incorrect format.");
        }

        // Alternation (Vertical Line)

        String string = "00";

        if (string.matches("00|111|0000")) {
            System.out.println("The string contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }

        // Affecting Part of a String (Parentheses)

        String string2 = "car";

        if (string2.matches("car(|s|)")) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

        // Quantifiers
        // The quantifier * repeats 0 ... times, for example;

        String string3 = "trololololo";

        if (string3.matches("tro(lo)*")) { // tro da "Correct form."
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The quantifier + repeats 1 ... times, for example;

        String string4 = "trolololo";

        if (string4.matches("tro(lo)+")) { // tro "Incorrect form."
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        String string5 = "nananananananana Batmaan!";

        if (string5.matches("(na)+ Batmaan!")) {
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The quantifier ? repeats 0 or 1 times, for example:

        String string6 = "111888";

        if (string6.matches("111(44)?888")) { // ortada 44 varsa veya 44 yoksa corresct diger durumlarda incorrect
            // 111888 and 11144888 correct  //11155888, 11166888 incorrect
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The quantifier {a} repeats a times, for example:

        String string7 = "1010";

        if (string7.matches("(10){2}")) { // birden fazla karakter icin parantez ()
            // 10 repeat 2 times or not
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The quantifier {a,b} repeats a ... b times, for example:

        String string8 = "11111";

        if (string8.matches("1{2,4}")) { //1 in tekrari 2 den 4 e kadarsa correct
            // 11, 111, 1111 correct
            //1, 11111 incorrect
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        // The quantifier {a,} repeats at least a times, for example:

        String string9 = "11111";

        if (string9.matches("1{2,}")) { // en azindan 2 kere tekrar ediyor mu?
            System.out.println("Correct form.");
        } else {
            System.out.println("Incorrect form.");
        }

        /*
        Character Classes (Square Brackets)
A character class can be used to specify a set of characters in a compact way.
Characters are enclosed in square brackets, and a range is indicated with a dash.
For example, [145] means (1|4|5) and [2-36-9] means (2|3|6|7|8|9).
Similarly, the entry [a-c]* defines a regular expression that requires the string to contain only a, b and c.
         */


    }
}
