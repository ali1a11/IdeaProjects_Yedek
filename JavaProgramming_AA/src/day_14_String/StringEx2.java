package day_14_String;

public class StringEx2 {
    public static void main(String[] args) {

        String str1 = "    batch E 9  ";

        str1.trim(); // only spaces before and after the string will be removed (not the spaces between characters)
        String str2 = str1.trim(); // only spaces before and after the string will be removed (not the spaces between characters)

        System.out.println("str1 = " + str1); // str1 =     batch E 9
        System.out.println("str2 = " + str2); // str2 = batch E 9


        String str3 = "Hello World";
        str3.indexOf("W");
        int i = str3.indexOf("W"); // it count from leftside

        System.out.println("i = " + i); // i = 6
        System.out.println("i = " + str3.indexOf("W")); // i = 6 // it count from leftside

        // if you want to find second o's index make it unique
        int i2 = str3.indexOf("or");
        System.out.println("i2 = " + i2); // i2 = 7
        
        String str4 = "Java Programming Language";
        
        int n = str4.indexOf("a "); // to find second a's index
        System.out.println("n = " + n);


        String str5 = "Java Programming Language";

        int n1 = str4.lastIndexOf("g");
        System.out.println("n1 = " + n1); // n1 = 23



    }
}
