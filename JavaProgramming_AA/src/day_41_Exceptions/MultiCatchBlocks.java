package day_41_Exceptions;

import day_39_Encapsulation_Inheritance_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test is started.");

        Employee employee = null;

        try {
            System.out.println(employee.getSalary()); // Null pointer exception

        } catch (IndexOutOfBoundsException e) {
            System.out.println("First catch block");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Second catch block");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Third catch block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Fourth catch block");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }

        // If the exception is not handled with catch block, program will be terminated
        // and codes after that do not run

        System.out.println("Test is completed.");

        System.out.println("--------------------");

        try{
            System.out.println("Java".charAt(9));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }
}
