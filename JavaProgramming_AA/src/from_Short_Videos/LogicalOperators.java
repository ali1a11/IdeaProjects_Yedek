package from_Short_Videos;

public class LogicalOperators {
    public static void main(String[] args) {
//                && Logical AND
//                || Logical OR
//                ! Logical NOT

        // && Logical AND
        boolean result1 = 10 > 5 && 10 > 7;
        boolean result2 = 20 > 15 && 20 > 25;
        boolean result3 = 30 > 50 && 30 > 10;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        // || Logical OR
        boolean result4 = 10 == 10 || 10 != 30;
        boolean result5 = 80 == 60 || 40 < 70;
        boolean result6 = 6 < 2 || 3 > 5;

        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);

        // ! Logical NOT
        boolean result7 = !true;
        boolean result8 = !false;
        boolean result9 = !(10==20);
        System.out.println("result7 = " + result7);
        System.out.println("result8 = " + result8);
        System.out.println("result9 = " + result9);


    }
}
