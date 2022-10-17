package day_40_Protected_Access_Modifier_Final;

public class FinalVariable {

    final String birthDay; // without constructor, it gives compile error
    final static String name;

    // we can use static block to initialize static variable
    static  {
        name = "Wooden spoon";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }


    public static void main(String[] args) {

        final double pi = 3.14;
        //pi = 5; // Compile error // final variables cannot be reassigned

        final String name;
        name = "Java"; // final variable can be initialized one time
        // name = "ASD"; // Compile error // it can be reassigned

        System.out.println("name = " + name);

        //--------------

        FinalVariable obj = new FinalVariable("01.08.2022");
        // final variable cannot be reasigned after it is initialized
        System.out.println(obj.birthDay);


        //---------------
        System.out.println("FinalVariable.name = " + FinalVariable.name);


    }
}
