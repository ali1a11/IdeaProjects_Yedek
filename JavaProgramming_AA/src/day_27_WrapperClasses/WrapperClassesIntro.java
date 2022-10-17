package day_27_WrapperClasses;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; //autoboxing (primitive to object)

        int num2 = n1; //unboxing (object to primitive)

        Integer integerValue = 100;

        long longValue = integerValue;

        // primitive can be converted to its own Wrapper class byte to Byte, int to Integer
        // But Wrapper classes can be converted to any primitive Integer to in as well as byte, short or long (as well as its range

        int num3 = 200;
        // Long l2 = num3; // that cannot be done //compile error.

        Integer nm4 = num3; //autoboxing

        Byte b1 = 25;
        byte a1 = b1;
        short a2 =b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("--------------------------------");

        Integer z = 900;
        Integer y = z; // this not autoboxing or unboxing

        System.out.println("--------------------------------");

        int[] numbers1 = {1, 2, 3, 4, 5,};
        Integer[] numbers2 = {1, 2, 3, 4, 5,};
        // primitive types cannot be used in collections and maps therefore wee need Wrapper classes to convert



    }
}
