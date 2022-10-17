package day_40_Protected_Access_Modifier_Final;

public class ProtectedAccessModifier {
    static String name1 = "Cydeo"; // default access modifier
    protected static String name2 = "Wooden spoon"; //protected access modifier

    // Protected is visible outside the package in subclass only




    static void method1(){ // default access modifier

    }

    protected static void method2(){ //protected access modifier
        System.out.println("method2 has protected access modifier ");
    }
}
