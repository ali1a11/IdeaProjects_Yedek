package from_Short_Videos.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Hello");

        // we can throw exception intentionally

        // throw new ArithmeticException("Wrong calculation");

        // throw new InterruptedException();
        System.out.println("Test Hello");

        System.out.println("Enter your age: ");

        int age = new Scanner(System.in).nextInt();

        if(age<0 || age >120){
            throw new InputMismatchException("Invalid age");
        }

        System.out.println("age = " + age);

    }
}
