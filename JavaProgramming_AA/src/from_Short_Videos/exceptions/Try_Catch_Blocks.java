package from_Short_Videos.exceptions;

public class Try_Catch_Blocks {
    public static void main(String[] args) {

        try {
            System.out.println(8/0);
            System.out.println("tyr block");

        } catch (ArithmeticException e) { // RuntimeException you can use if you do not know runtime exception name
            e.printStackTrace();
            // System.out.println(e.getMessage());
            System.out.println("catch block");
        } finally {
            System.out.println("finally block"); // exception is handled or not finally block will be executed
        }

        System.out.println("Hello World");

    }
}
