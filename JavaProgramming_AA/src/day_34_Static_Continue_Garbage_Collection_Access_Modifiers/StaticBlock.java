package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;

public class StaticBlock {
    public static void main(String[] args) {

        System.out.println("Main method");
    }

    static{
        System.out.println("Static Block 1"); // static bloc is executed before main
        //it runs only one time
        // There can be more than one static block
        // do not have name
        // also knowns as static initializor block
        // we can initialize static variables
    }

    static{
        System.out.println("Static Block 2"); // static bloc is executed before main
        //it runs only one time
    }
    static{
        System.out.println("Static Block 3"); // static bloc is executed before main
        //it runs only one time
    }

}
