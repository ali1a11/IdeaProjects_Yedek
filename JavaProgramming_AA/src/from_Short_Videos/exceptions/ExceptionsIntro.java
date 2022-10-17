package from_Short_Videos.exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4};

        // System.out.println(arr[15]); // unchecked exception (index out of bound)

        // System.out.println("Java".charAt(-1)); // unchecked exception (index out of bound)

        // System.out.println(8/0); // unchecked exception (Arithmetic exception)

        String str = null;
        // System.out.println(str.toUpperCase()); // unchecked exception (Null Pointer exception)

        System.out.println("Hello World");

        System.out.println("------checked exception----------------");
        // Thread.sleep(1000); // checked exception

        // FileInputStream file = new FileInputStream("file.txt"); // checked exception
    }
}
