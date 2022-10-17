package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

public class AccessModifiers {


    public static int publicData = 100;
    static int defaultData = 200; // access modifier: default
    private static int privateData = 300;

    public static void main(String[] args) {
        System.out.println(publicData);  // reachable in the same class
        System.out.println(defaultData); // reachable in the same class
        System.out.println(privateData); // reachable in the same class
    }

    public static void method1() {
        System.out.println("Access modifier of the method: public");
    }

    static void method2() {
        System.out.println("Access modifier of the method: default");
    }

    private static void method3() {
        System.out.println("Access modifier of the method: private");
    }



}
