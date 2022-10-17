package day_07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, <, >=, <=
        boolean result1 = 200>50;
        System.out.println("result1 = " + result1); //true

        boolean result2 = 200<50;
        System.out.println("result2 = " + result2); //false

        boolean result3 = 100>=100;
        System.out.println("result3 = " + result3); //true

        boolean result4 = 500<=00;
        System.out.println("result4 = " + result4); //false

        // == !=
        int xx = 100;
        int yy = 200;
        boolean equal = xx==yy;
        System.out.println("equal = " + equal);

        //Strin icin kullanilabilir
        boolean result8 = "Good" == "Good"; //true
        System.out.println("result8 = " + result8);

        boolean result9 = "A" == "a"; //false

        // !=
        boolean result10 = 100 != 50; //true
        System.out.println("result10 = " + result10);

        boolean result11 = 75 == 75;
        System.out.println("result11 = " + result11);

    }
}
