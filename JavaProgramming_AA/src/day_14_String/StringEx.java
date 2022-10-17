package day_14_String;

public class StringEx {
    public static void main(String[] args) {

        String str = "cydeo";
        System.out.println("str = " + str);

        str.toUpperCase(); //"CYDEO"
        System.out.println(str.toUpperCase());
        System.out.println("str = " + str);

        str = str.toUpperCase();
        System.out.println("str = " + str);

        int length = str.length();

        char firstChar = str.charAt(0);

        System.out.println("length = " + length);
        System.out.println("firstChar = " + firstChar);

        System.out.println("Lowercase = " + str.toLowerCase());

        System.out.println("Uppercase = " + str.toUpperCase());
    }



}
