package day_32_CustomClass_Constructor;

public class Test {
    public Test(){
        System.out.println("A");
    }

    public Test(int a){
        this(); // calls previous constructor
        System.out.println("B");
    }

    public Test(double a){
        this(10); // calls previous constructor
        System.out.println("C");
    }

    public Test (String str){
        this(2.5); // calls previous constructor
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test(10);
        System.out.println("----------------------");
        new Test("Java");
    }

}
