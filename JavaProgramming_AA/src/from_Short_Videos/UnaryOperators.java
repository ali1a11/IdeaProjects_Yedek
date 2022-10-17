package from_Short_Videos;

public class UnaryOperators {
    public static void main(String[] args) {

        //positive and negative
        int a = -100;
        int b = +200; // + optional

        boolean aIsNegative = a < 0;
        boolean bIsPositive = b > 0;

        System.out.println("aIsNegative = " + aIsNegative);
        System.out.println("bIsPositive = " + bIsPositive);

        //pre increment/decrement
        int x = 10;
        System.out.println(++x); // 11
        System.out.println(--x); // 10

        //post increment/decrement
        int y = 20;
        System.out.println(y++); // 20
        System.out.println(y); //21

        int z = 50;
        System.out.println(z--); // 50
        System.out.println(z); // 49

    }
}
