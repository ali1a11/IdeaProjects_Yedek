package day_27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); //int to int, primitive to primitive // not autoboxing or unboxing

        System.out.println("num = " + num); // 123
        
        System.out.println(num +1); // 124 addition

        System.out.println(str +1); // 1231 concatenation

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); //String to double
        System.out.println("num2 = " + num2);


        int min = Integer.MIN_VALUE; //gives min int value in java
        int max = Integer.MAX_VALUE; //gives max int value in java

        System.out.println("min = " + min); // min = -2147483648
        System.out.println("max = " + max); // max = 2147483647

        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;

        System.out.println("minL = " + minL); // minL = -9223372036854775808
        System.out.println("maxL = " + maxL); // maxL = 9223372036854775807

        String s1 = "true";
        boolean b1 = Boolean.parseBoolean(s1);

        System.out.println("b1 = " + b1); // b1 = true
        
        String s2 = "maybe"; // if not "true" returns false
        boolean b2 = Boolean.parseBoolean(s2);

        System.out.println("b2 = " + b2); // b2 = false

        System.out.println("----------------------------------------");

        // valueOf methods: converts String to wrapper class
        String s3 = "123";
        Integer x = Integer.valueOf(s3);
        System.out.println("x = " + x); // x = 123

        int x1 = Integer.valueOf(s3); // Integer to primitive int //unboxing
        System.out.println("x1 = " + x1); // x1 = 123

        System.out.println("----------------------------------------");

        String s4 = "1.5";
        Double z1 = Double.valueOf(s4);
        double z2 = Double.valueOf(s4);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);

        System.out.println("----------Chracter------------------------------");

        // isDigit()
        char ch1 = 'u';
        boolean b4 = Character.isDigit(ch1);

        System.out.println("b4 = " + b4);


        // isLetter()
        boolean b5 = Character.isLetter((ch1));

        System.out.println("b5 = " + b5);

        // isLetterorDigit()
        boolean b6 = Character.isLetterOrDigit(ch1);

        boolean b7 = !Character.isLetterOrDigit(ch1); //special character mi?

        System.out.println("b6 = " + b6);
        System.out.println("b7 = " + b7);

        // isUpperCase
        
        boolean b8 = Character.isUpperCase(ch1);
        System.out.println("b8 = " + b8);
        
        // isLowerCase    
        boolean b9 = Character.isLowerCase(ch1);
        System.out.println("b9 = " + b9);

        System.out.println("---------------------");

        String s = "ab1dfs3d8f5sdf4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }

        System.out.println("sum = " + sum);



    }
}
