package from_Short_Videos.OOP_abstraction_interface;

interface A {
int a = 100; // static and final
    // interface cannot have constructor

    // no instance method in interface
    public static void method2(){

    }
     void method3(); // public abstract

    public default void method4(){

    }


}

abstract class X {
    public int a1;
    int a2;
    private int a3;
    protected static int a4;

    static int b;

    public X(){ // constructor

    }

    public abstract void method3();

    public void method1(){

    }

    public static void method2(){

    }


}


public class AbstractClass_vs_Interface {
    public static void main(String[] args) {

        // we can create object from interface and abstract class

    }

}
