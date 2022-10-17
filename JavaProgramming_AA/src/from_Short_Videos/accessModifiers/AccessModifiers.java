package from_Short_Videos.accessModifiers;

public class AccessModifiers {
    private static int n1 = 100;
    static int n2 = 200; // default
    public static int n3 = 300;


    private static void method1(){
        System.out.println("Method with private access modifier");
    }

    static void method2(){ // default
        System.out.println("Method with default access modifier");
    }

    public static void method3(){
        System.out.println("Method with public access modifier");
    }

}
