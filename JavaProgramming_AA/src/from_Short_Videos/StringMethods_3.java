package from_Short_Videos;

public class StringMethods_3 {
    public static void main(String[] args) {
        // isEmpty(): checks if the String's length is zero, return type --> boolean
        String str1 = "   ";
        boolean r1 = str1.isEmpty();
        System.out.println("r1 = " + r1); // r1 = false

        System.out.println("--------------------------");

        // isBlank(): checks if the String is blank, return type --> boolean
        String str2 = "   ";
        boolean r2 = str2.isBlank();
        System.out.println("r2 = " + r2); // r2 = true

        System.out.println("--------------------------");

        // equals(): compares the content of the two String, return type --> boolean

        String s1 ="Java";
        String s2 = new String("Java");
        // They are two different objects
        System.out.println("(s1 == s2) = " + (s1 == s2)); // (s1 == s2) = false
        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // s1.equals(s2) = true


        System.out.println("--------------------------");

        // equalsIgnoreCase(String): compares the contents of the two Strings irrespective of the case sensitivity, return type --> boolean
        String word1 = "JAVA";
        String word2 = "java";
        System.out.println("word1.equalsIgnoreCase(word2) = " + word1.equalsIgnoreCase(word2));

        System.out.println("--------------------------");
        // contains(String): checks if the given string is contained in the String, return type --> boolean
        String sentence = "He loves Java programming language.";
        boolean containsC = sentence.contains("C");
        System.out.println("containsC = " + containsC);

        System.out.println("--------------------------");
        // startsWih(String): checks if the String starts with the given character(s), return type --> boolean

        String text = "wooden spoon";
        boolean result1 = text.startsWith("woo");
        System.out.println("result1 = " + result1);

        System.out.println("--------------------------");
        // endsWith(String): checks if the String ends with the given character(s), return type --> boolean
        String text2 = "wooden spoon";
        boolean result2 = text2.endsWith("oon");
        System.out.println("result2 = " + result2);

    }
}
