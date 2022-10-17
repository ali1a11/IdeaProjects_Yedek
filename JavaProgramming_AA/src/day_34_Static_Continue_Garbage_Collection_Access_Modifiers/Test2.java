package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

import day_34_Static_Continue_Garbage_Collection_Access_Modifiers.Circle; // regular import

// if you need to import only static members of the class we can use static import

import static day_34_Static_Continue_Garbage_Collection_Access_Modifiers.Circle.*;


public class Test2 {
    public static void main(String[] args) {
        System.out.println(Circle.pi); // 0.0 if static variables initialized in the main method, it returns default value
        // Because main methon in the Circle class runs when Circle class runs
        System.out.println(Circle.numbers); // null

        // if we initialize static variables in the Circle class we get
        // pi = 3.14
        // numbers = [10, 20]

        // static block will be executed when the class is called

    }
}
