package from_Short_Videos;

public class StringMethods_1 {
    public static void main(String[] args) {
        // charAt(int index): Returns the character (Unicode code point) at the specified index. return type --> char
        String str = "Cydeo";
        // index:     01234

        System.out.println("str.charAt(2) = " + str.charAt(2));

        System.out.println("-------------------------");
        //length(): returns the total number of characters. return type --> int

        System.out.println("str.length() = " + str.length());

        int lastIndex = str.length() - 1;

        System.out.println("lastIndex = " + lastIndex);

        System.out.println("-------------------------");
        // toLowerCase(): returns the all lower case version of the String, return type --> String
        String str3 ="Java";
        str3.toLowerCase();
        System.out.println("str3.toLowerCase() = " + str3.toLowerCase());

        str3 = str3.toLowerCase();
        System.out.println("str3 = " + str3);

        System.out.println("-------------------------");
        // toUpperCase(): returns the all upper case version of the String, return type --> String
        String str4 = "Wooden";
        str4.toUpperCase();
        System.out.println("str4.toUpperCase() = " + str4.toUpperCase());

        str4 = str4.toUpperCase();
        System.out.println("str4 = " + str4);

        System.out.println("-------------------------");
        // trim(): returns the String the with all leading and trailing white space removed.
        String str5 = "        Java Programming Language           ";
        str5 = str5.trim();

        System.out.println("str5 = " + str5); // str5 = Java Programming Language

        System.out.println("-------------------------");
        // indexOf(): returns the first matching character's index number, return type --> int
        String str6 = "Wooden spoon";
        int indexNumberOfFirsto = str6.indexOf("o");
        System.out.println("indexNumberOfFirsto = " + indexNumberOfFirsto); // indexNumberOfFirsto = 1

        int indexNumberOfSecondo = str6.indexOf("od");
        System.out.println("indexNumberOfSecondo = " + indexNumberOfSecondo); // indexNumberOfSecondo = 2

        int indexNumberOfThirdo = str6.indexOf("oon");
        System.out.println("indexNumberOfThirdo = " + indexNumberOfThirdo); // indexNumberOfThirdo = 9

        System.out.println("-------------------------");
        // lastIndexOf(): returns the last matching character's index number, return type --> int
        String str7 = "Wooden spoon";
        int indexNumberOfLasto = str7.lastIndexOf("o");

        System.out.println("indexNumberOfLasto = " + indexNumberOfLasto); // indexNumberOfLasto = 10

        // if there is no such a character, returns -1

        System.out.println("-------------------------");

    }
}
