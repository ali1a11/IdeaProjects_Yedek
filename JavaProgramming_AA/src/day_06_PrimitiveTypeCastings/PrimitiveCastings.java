package day_06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 100;
        short b= a; //do not need short b = (short)a;

        int a1 = 100;
        byte b1 = (byte) a;
        int x = 55;
        short y = (short) x;

        long j = 1000000;
        short k = (short)j;
        System.out.println("k = " + k);//print :16960 (same number cannot be took) shorts capacity

        double n = 10.8;
        int s = (int)n; // (int)(long) n;
        System.out.println("s = " + s); //10 not 10.8

        double d1=20.5;
        //short s1 = d1; //gecerli degil
        //shortcut Alt +Enter -> cast to short
        short s1 = (short) d1;

    }
}
