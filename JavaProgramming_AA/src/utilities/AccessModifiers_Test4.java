package utilities;

import day_40_Protected_Access_Modifier_Final.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
        // System.out.println(ProtectedAccessModifier.name1); // default is not visible outside the package
        System.out.println(ProtectedAccessModifier.name2); // protected is visible outside of the package if the class is subclass

        //Protected is visible outside the package in subclass only

        ProtectedAccessModifier.method2(); // method2 has protected access modifier and it is in the different package

    }
}
