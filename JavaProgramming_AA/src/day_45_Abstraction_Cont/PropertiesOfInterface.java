package day_45_Abstraction_Cont;

public abstract class PropertiesOfInterface {
    int a; // variables in interface static & final by default
    static int b;

    public PropertiesOfInterface(int a){ // interface does not have constructor
        this.a = a;
    }

    static { // interface does not have static block
        b = 100;
    }

    public void method1(){ // interface does not have instance method
        System.out.println("instance method");
    }

    public static void method2(){
        System.out.println("static method");
    }

    public abstract void method3();

    // Instance can have default method
    // why default method was introduced day 45, 1:44
    // if the method will be inherited with implementation we can use default method in Inheritance
/*
    public default void method4(){
        System.out.println("default method");
    }

 */

}
