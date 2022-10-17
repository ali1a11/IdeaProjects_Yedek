package day_37_Inheritance_Cont;

public class ConstructorPractice {
    public static void main(String[] args) {
        B b1 = new B(); //A //B
        //System.out.println(b1);
    }
}

class A {
    public A(){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        // super(); //implicitly // if parent class has default constructor
        // if parent has not a default constructor we have to use super keyword in child class constructor
        System.out.println("B");
    }
}

