package from_Short_Videos.accessModifiers;

public class Test {
    public static void main(String[] args) {

        // System.out.println("AccessModifiers.n1 = " + AccessModifiers.n1); // java: n1 has private access in from_Short_Videos.accessModifiers.AccessModifiers
        System.out.println("AccessModifiers.n2 = " + AccessModifiers.n2);
        System.out.println("AccessModifiers.n3 = " + AccessModifiers.n3);

        // AccessModifiers.method1(); // private access modifier
        AccessModifiers.method2();
        AccessModifiers.method3();


    }
}
