package day_41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {
    public static void main(String[] args) {

        System.out.println("Test 1 is started");

        try {
            // System.out.println(9 / 0);
            System.out.println("Try block");
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
            System.out.println("Arithmetic exception was occurred.");
        }

        System.out.println("Test 1 is completed");


        System.out.println("--------------------------------------");

        System.out.println("Test 2 is started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[99]);
            System.out.println("Try block");
        } catch (
                ArrayIndexOutOfBoundsException e) { // if you do not know exception type use catch (RuntimeException e) for unchecked exceptions

            e.printStackTrace(); // prints a stack trace (full details) of the exception
            /*
            java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 5
	        at day_41_Exceptions.TryCatchBlock.main(TryCatchBlock.java:26)
             */

            // System.out.println("e.getMessage() = " + e.getMessage()); // returns only brief description of the exception
            /*
            e.getMessage() = Index 99 out of bounds for length 5
             */

            //System.out.println("Catch block");
            //System.out.println("ArrayIndexOutOfBoundsException was occurred");
        }

        System.out.println("Test 2 is completed");
        System.out.println("----------------------------------------------------");

        System.out.println("Test 3 is started");

        try {
            // System.out.println("Java".substring(2, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
            /*
java.lang.StringIndexOutOfBoundsException: begin 2, end 0, length 4
	at java.base/java.lang.String.checkBoundsBeginEnd(String.java:3319)
	at java.base/java.lang.String.substring(String.java:1874)
	at day_41_Exceptions.TryCatchBlock.main(TryCatchBlock.java:51)
             */
        }

        System.out.println("Test 3 is completed");

        System.out.println("-----------------------");

        System.out.println("Test 4 is started");

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello again");

        System.out.println("----------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }


    }

}
