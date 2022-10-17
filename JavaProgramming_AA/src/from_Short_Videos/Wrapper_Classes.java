package from_Short_Videos;

// Primitive --> byte   short   int     long    float   double      char        boolean
// Wrapper C --> Byte   Short   Integer Long    Float   Double      Character   Boolean

// Auto boxing --> primitive to Wrapper class object

// Unboxing --> Wrapper class object to primitive

public class Wrapper_Classes {
    public static void main(String[] args) {

        byte a = 10;
        short b = 20;
        int c = 30;

        Byte x = a; // auto boxing
        Short y = b;
        Integer z = c;

        byte aa = x;
        short bb = y;
        int cc = z; // unboxing

        // parse methods: returns primitive
        // converts String to primitive
        String str = "123";

        int num1 = Integer.parseInt(str);
        System.out.println("num1 = " + num1);

        // valueOf methods: returns Wrapper class object
        // converts String to Wrapper class object
        String str2 = "1.5";
        Double num2 = Double.valueOf(str2);
        double num3 = Double.valueOf(str2); //we can assign to primitive // unboxing

        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

    }
}
