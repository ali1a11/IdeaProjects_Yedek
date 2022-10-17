package from_Short_Videos.OOP_abstraction;



abstract class A{
    int a;
    static int b;
    public A(){};

    public void method1(){}

    public static void method2(){}

    public abstract void method3();

}

class B extends A{

    // concrete class cannot have abstract method
    @Override
    public void method3() {

    }
}


public class AbstractClacc_vs_ConcreteClass {
    public static void main(String[] args) {
        // A a = new A(); // object can not be created from abstract class

    }
}