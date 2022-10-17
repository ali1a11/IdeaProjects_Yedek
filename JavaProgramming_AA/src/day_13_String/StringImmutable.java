package day_13_String;

public class StringImmutable {
    public static void main(String[] args) {

        String str = "wooden spoon";

        System.out.println(str.toUpperCase());// WOODEN SPOON .toUpperCase() creates new object, doest change str
        System.out.println(str); // wooden spoon

        str = str.toUpperCase();
        System.out.println(str); // WOODEN SPOON
    }
}
