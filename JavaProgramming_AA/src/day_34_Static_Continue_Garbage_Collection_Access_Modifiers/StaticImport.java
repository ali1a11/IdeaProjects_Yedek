package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

// importing static member of Circle class
import static day_34_Static_Continue_Garbage_Collection_Access_Modifiers.Circle.pi;

public class StaticImport {
    public static void main(String[] args) {

        // if it is important we do not need to call class again

        System.out.println(pi); // 3.14 // // no need Circle.pi

        // if the static variable is not imported we have to call the class

        System.out.println(Circle.pi);


    }
}
