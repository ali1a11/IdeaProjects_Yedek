package utilities;

import day_40_Protected_Access_Modifier_Final.ProtectedAccessModifier;

public class AccessModifiers_Test3 {
    public static void main(String[] args) {
        // System.out.println(ProtectedAccessModifier.name1); // default is not visible outside the package
        // System.out.println(ProtectedAccessModifier.name2); // protected is not always visible outside the package
        // if this class were subclass, it is possible to access protected

        // Protected is visible outside the package in subclass only
    }
}
