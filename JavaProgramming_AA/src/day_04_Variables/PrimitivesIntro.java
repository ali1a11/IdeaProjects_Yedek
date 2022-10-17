package day_04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age: 38 years old
        byte age = 38; //give readable and understandable name

        // weight
        //byte weight =160; // 160 is out of range of byte
        short weight = 160;

        //salary
        // short salary = 80000; // 80000 is out of short's range
        int salary = 80000; // preferred data type for integers
        salary = 180_000; // we can use _ for readability
        System.out.println(salary);

        //java heap memory
        // it is important to use right variable type for memory use

        // for long need to force
        // if you do not force long number compiler takes it as an integer (default for integers)
        // long asset = 3_333_333_333; yerine long asset = 3_333_333_333L;
        long asset = 3_333_333_333L; // long integer dan sonra L or l
        long asset2 = 4_444_444_444l;
        // if you do not use L compiler take it as integer


        //default decimal is double. İf you enter a decimal number it is taken as double

        // taxRate = 0.26
        float taxRate = 0.26F; // for float we need to force it iwth using F or f

        double birthRate = 0.75; // double is (preferred) default for decimal no need to force

        // double > float > long > int > short > byte

        //char
        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch3 = 65535;
        System.out.println("ch3 = " + ch3);

        //char ch4 = 'AB'; //char variable accepts only a single character

        boolean isEmployed = true;
        boolean isMarried = false;
        boolean result = 100>75;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

    }
}
