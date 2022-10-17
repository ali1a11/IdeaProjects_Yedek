package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

// outer class has public modifier and cannot be static
public class StaticMembers {

    // static variable
    public static int num = 10;

    // static method
    public static void main(String[] args) {

    }

    // static block

    static {

    }

    // static class
    // precondition it has to be nested class (it has to be a member of another class)

    // inner class has not public modifier and can be static

    static class class1{

    }

}
class A{
    static class B {
        public static void method1(){

        }

    }
}

class C {
    public static void main(String[] args) {
        // to call inner class B
        // to access members of class we have to call outer class A
        A.B.method1();
    }
}

// Nested classes are not recommended. It makes code complicated.