package utilities;

import day_34_Static_Continue_Garbage_Collection_Access_Modifiers.AccessModifiers;

public class AccessModifiersTest2 {
    public static void main(String[] args) {


        System.out.println(AccessModifiers.publicData); // accessable
        // System.out.println(AccessModifiers.defaultData); // default access modifier cannot be accessed from outside package
        // System.out.println(AccessModifiers.privateData); // private access modifier cannot be accessed outside of the class


        AccessModifiers.method1();
        // AccessModifiers.method2(); // not accessable at the different package
        // AccessModifiers.method3();  // not accessable outside of the class




    }
}
