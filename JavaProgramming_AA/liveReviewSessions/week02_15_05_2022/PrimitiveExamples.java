package week02_15_05_2022;

public class PrimitiveExamples {
    public static void main(String[] args) {
        //Variables: primitive types: Numbers // Characters // Boolean
        /*
        NUmbers: Integers --> byte short int long
                decimals(floating points) --> float and double

        Characters: char data type
                    not primitive however String: collection of chars
        Boolean: true / false
         */



        //Data type

        //
        /* DataType variableName = Value; declare and initialize at the same time
            DataType ; //declare
            variableName = Value; // initialize

            DataType variableName1, variableName2;


        */

        byte num1; // declare a var
        num1 = 123; // initialize, assign a variable
        num1 = 125; // re-assigne a different value

        short num2 =1234; // declare and initialize

        int distance = 1_000_000_000;

        long distanceMore = 3_000_000_000L; //passing the limit
        long distanceShorter = 1_000_000_000; // inside the limit of default dataType (int), no need to force with L

        float rate = 1000.5F;
        double dNumber = 123.4;

        // assign num1(byte) to num2 --> from smaller dataType to bigger dataType
        num2 = num1; //implicit casting, done by compiler

        //long to short
        num2 = (short) distance; //explicit casting, done by code developer

        //PIQ Popular Interview Question

        char ch = 'a';

        // ////////////////////////////////////////
        int x = 5 + ch; // 'a' = 97 ASCII table

        System.out.println("x = " + x); // 102 = 5 + 97;

        String str = ""+'J' + 'a' + 'v' + 'a'; // empty "" makes all the chars coming after to turn into Strings

        System.out.println("str = " + str); //Java

        int y ='J' + 'a' + 'v' + 'a';

        System.out.println("y = " + y); //386

        String z = String.valueOf('J' + 'a' + 'v' + 'a');
        System.out.println("z = " + z); //386

        //Java runs from left to right
        // String + char = String

        boolean b1 = true; // you can assign conditions to these variable
        boolean b2 = false;
        /*
        x= 5;
        y=2;
        x>y -> true
         */

        boolean b3 = 5>2;
        System.out.println(b3);  // true

        //Variable naming rules

        double _average = 5.5;
        String EU9 = "Great"; // valid but not
        String println = "println is not reserved word";
        // String for = "for is reserved"; // not valid

        //42solution = 450; not valid

        //variableNames camelCase
        //sumOfData

    }


}
