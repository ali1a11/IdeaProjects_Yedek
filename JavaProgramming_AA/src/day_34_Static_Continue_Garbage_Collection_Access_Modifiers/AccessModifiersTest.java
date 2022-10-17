package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData); // accessable in the same package
        System.out.println(AccessModifiers.defaultData); // accessable in the same package // in the different package not accessable
        // private is not accessable outside of the class (even in the same package)



        AccessModifiers.method1();
        AccessModifiers.method2();
        // AccessModifiers.method3(); // private is not accessable outside of the class (even in the same package)

    }
}
