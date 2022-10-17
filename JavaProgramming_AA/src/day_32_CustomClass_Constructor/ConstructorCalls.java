package day_32_CustomClass_Constructor;

public class ConstructorCalls {

    public ConstructorCalls() {
        System.out.println("Default constructor");
    }


    public ConstructorCalls(int a) {
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str) {
        this(10); // it can call one of the previous constructor but not both
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();
        // Output:
        // Default constructor

        ConstructorCalls obj2 = new ConstructorCalls(10);
        // Output:
        // Default constructor
        // Constructor with int argument

        ConstructorCalls obj3 = new ConstructorCalls("Java");
        // Output:
        // Default constructor
        // Constructor with int argument
        // Constructor with String argument


    }




}
