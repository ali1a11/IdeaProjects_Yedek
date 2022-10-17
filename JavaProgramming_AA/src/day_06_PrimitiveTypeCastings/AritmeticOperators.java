package day_06_PrimitiveTypeCastings;

public class AritmeticOperators {
    public static void main(String[] args) {

        System.out.println("12" + 1); //121
        System.out.println(10+ 4);
        System.out.println(10- 4);
        System.out.println(10* 4);
        System.out.println(10/ 4); //sonuc int olur. double yapmak istiyorsan pay veya payda double olmalı
        System.out.println(10.0/ 4);
        System.out.println(10/ 4.0);
        System.out.println(((double)10/4));
        System.out.println(1.0*10/ 4);
        System.out.println(10d/ 4);
        System.out.println(10/ 4d);

        double d = 100/16;
        System.out.println(d); //6.0

        double d2 = (double)100/16;
        System.out.println(d2); //6.25

        System.out.println(100d); //100.0

    }
}
