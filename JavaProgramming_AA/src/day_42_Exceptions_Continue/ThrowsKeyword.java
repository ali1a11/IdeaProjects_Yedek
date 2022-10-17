package day_42_Exceptions_Continue;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException { // throws is temporary solution when handling exceptions
        // whenever this method is called whatever called this method is in trouble

        // If the method is not going to be called, throws can be best solution

        System.out.println("---------------Test 1----------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("World");

        System.out.println("---------------Test 1 is completed----------------------");

        System.out.println("---------------Test 2----------------------");

        System.out.println("Hello");
        Thread.sleep(3000); // throws is used instead of try and catch
        System.out.println("EU 09");

        System.out.println("---------------Test 2 is completed----------------------");
    }
}
