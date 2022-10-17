package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

import static utilities.MathUtility.*;

public class Test3 {
    public static void main(String[] args) {

        // find sum of 10 and 20
        int n1 = sum(10,20); // if the method is important there is no need to call class name here

        System.out.println("n1 = " + n1);

        int n2 = subtraction(10, 20);

        int n3 = max(10, 20);
        

    }
}
