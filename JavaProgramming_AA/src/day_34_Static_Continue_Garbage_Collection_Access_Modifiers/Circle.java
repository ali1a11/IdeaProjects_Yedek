package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;

    // if we have static variable that takes several steps to initialize (set) we can use static block
    /*
    public static ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    */
    public static ArrayList<Integer> numbers;

    public Circle(double radius) {
        this.radius = radius;
        // pi = 3.14; // do not use constructor to set static variable
        // static needs to be initialized one time only
        // constructor can be executed several times
    }

    static {
        // radius = 5; // instances can not be initialized in the static block
        // static block does not have access to instances
        pi = 3.14; // static variables can be initialized in the static block
        // for static block does not matter that it can be one step or several steps to set static variables
        //
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        // if we have static variable that takes several steps to initialize (set) we can use static block
    }

    public static void main(String[] args) {
        pi = 3.14;
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("numbers = " + numbers);

    }
}
// do not initialize static variables in the main method.
// Because main method can be in the different class + ...