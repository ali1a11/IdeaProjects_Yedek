package day_13_String;


// import java.lang.String; // String is in java.lang but not need to be imported
// lang package is special. It is imported implicitly. It is done by compiler

public class StringIntro {
    public static void main(String[] args) {

        String n1 = "Wooden Spoon";
        String n2 = "Wooden Spoon";
        String n3 = "Wooden Spoon";
        String n4 = "Wooden Spoon";

        System.out.println(n1 == n2); //true
        System.out.println(n2 == n3); //true
        System.out.println(n3 == n4); //true

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        System.out.println(str1 == str2); //false
        System.out.println(str2 == str3); //false
        System.out.println(str3 == str4); //false

        System.out.println(str1.equals(str2)); //true
        System.out.println(str2.equals(str3)); //true
        System.out.println(str3.equals(str4)); //true
    }
}
