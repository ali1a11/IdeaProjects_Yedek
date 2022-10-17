package day_41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[9]);
            System.out.println("try block");
        } catch (RuntimeException e) {
            System.out.println("catch block");
            e.printStackTrace(); //throw new RuntimeException(e);
            System.exit(0); // program terminates before finally is executed
        } finally {
            System.out.println("finally block");
            // finally block gets executed regardless of the exception is being handled or not
        }

    }
}
