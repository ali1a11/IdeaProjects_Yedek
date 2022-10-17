package day_07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        //remainder
        System.out.println(num1 + " divided by " + num2 + " is equal to " + (10/3) + " with a remainder of " + (10%3));

        int a = 10;
        int b = 100;
        System.out.println("++a: " + (++a));
        System.out.println("--b: " + (--b));


        int a2 = 50;
        int b2 = 500;
        System.out.println("a2++: " + (a2++));
        System.out.println("b2--: " + (b2--));

        System.out.println("a2: " + (a2));
        System.out.println("b2: " + (b2));

        int p= 50;
        System.out.println("++p: "); //51   p = 51 // change immediately
        System.out.println("p++: "); //51   p = 52 // change one step later
        System.out.println("p: "); //52     p = 52

        int q= 30;
        System.out.println("--q: "); //29   q = 29
        System.out.println("q--: "); //29   q = 28
        System.out.println("q: "); //28     q = 28

        // Addition assignment
        // x = x + 200
        int x = 100;
        x += 200;
        System.out.println("x = " + x);

        //Addition assignment can be used for String data type
        String word1 = "Wooden";
        word1 += " Spoon"; //Wooden spoon secret code among CYDEO alumnies, students

        System.out.println("word1 = " + word1);

        //Subtraction Assignment
        int availableBalance = 1000;
        availableBalance -= 200; //withdrawn
        availableBalance += 400; //deposit

        System.out.println("availableBalance = " + availableBalance);

        // Multiplication Assignment
        double sallary = 50250.25;
        sallary *= 2;

        System.out.println("sallary = " + sallary);

        //Division Assignment
        double num4 = 25000.0;
        num4 /=2;

        System.out.println("num4 = " + num4);

        //Remainder Assignment

        int num5 = 100;
        num5 %=3;
        System.out.println("num5 = " + num5);

        int amount = 127; //cents
        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int cents2 = 127;
        cents2 %= 25;

        System.out.println("cents2 = " + cents2);



    }
}
