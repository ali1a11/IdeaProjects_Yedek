package from_Short_Videos;

public class ShorthandOperators {
    public static void main(String[] args) {
        // x= y
        // x += y -> x = x + y
        // x -= y -> x = x - y
        // x *= y -> x = x * y
        // x /= y -> x = x / y
        // x %= y -> x = x % y

        //Assignment
        int a = 100;
        a = 200;

        System.out.println("a = " + a);

        // Addition assignment
        int b = 200;
        b += 100; // increase b by 100

        System.out.println("b = " + b);

        //Subtraction assignment
        int c = 10;
        c -= 3; // decreases c by 3 and assign it

        System.out.println("c = " + c); // c = 7

        // Multiplication assignment
        int d = 20;
        d *= 5; // multiples d by 5 and assign it

        System.out.println("d = " + d); // d = 100

        //Division assignment
        int e = 40;
        e /= 4; // divides e by 4 and assign it

        System.out.println("e = " + e); // e = 10

        //Remainder assignment
        int f = 20;
        f %= 10; // f = 20 % 10 = 0 // remainder of 20 divided by 10 assign it

        System.out.println("f = " + f); // f = 0


    }
}
