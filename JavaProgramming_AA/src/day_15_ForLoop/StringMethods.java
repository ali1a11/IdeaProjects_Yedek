package day_15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = "";

        boolean b1 = str.isEmpty();
        System.out.println("b1 = " + b1); // b1 = true


        boolean b2 = str.isBlank();
        System.out.println("b2 = " + b2); // b2 = true

        // .equalsIgnoreCase();
        String str1 = "java programming";
        String str2 = "JAVA PROGRAMMING";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2)); //true

        //.contains()
        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");

        System.out.println("hasCSharp = " + hasCSharp); // hasCSharp = false
        System.out.println("hasJava = " + hasJava); // hasJava = true

        // to ignare case sensitivity first we can convert String to lower or upper case and use contains method

        boolean hasjava = sentence.toLowerCase().contains("java");
        System.out.println("hasjava = " + hasjava); // hasjava = true

        boolean hasJava2 = sentence.contains("java")|| sentence.contains("Java");

        String input1 = "I love JaVa";
        String input2 = "Java";

        System.out.println(input1.contains("Java")); // false
        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true


        //startsWith

        String str3 = "Wooden Spoon";

        boolean startsWith = str3.startsWith("Woo");
        boolean startsWith2 = str3.startsWith("oo");

        System.out.println("startsWith = " + startsWith); // startsWith = true
        System.out.println("startsWith2 = " + startsWith2); // startsWith2 = false

        //endsWith

        boolean endsWith = str3.endsWith("oon");
        boolean endsWith2 = str3.endsWith("oo");

        System.out.println("endsWith = " + endsWith); // endsWith = true
        System.out.println("endsWith2 = " + endsWith2); // endsWith2 = false

        // to ignore case sensitivity convert String to upper or lower case

        boolean startsWith3 = str3.toLowerCase().startsWith("wooden");

        System.out.println("startsWith3 = " + startsWith3);









    }
}

