package day_41_Exceptions;


import day_39_Encapsulation_Inheritance_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
        // unchecked exception

        int a = 5;
        int b = 0;

        //System.out.println(a/b);
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day_41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:10)

	Process finished with exit code 1
         */

        char[] characters = {'A', 'B', 'C'};

         // System.out.println(characters[99]);

        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 99 out of bounds for length 3
	at day_41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:20)

    Process finished with exit code 1
         */

        Student student = null;
        // System.out.println(student.getName());

        /*
        Exception in thread "main" java.lang.NullPointerException
	at day_41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:33)

    Process finished with exit code 1
         */

        String str = " Wooden spoon";
        str = null;

        // System.out.println(str.toString());

        /*
        Exception in thread "main" java.lang.NullPointerException
	at day_41_Exceptions.Checked_vs_Unchecked.main(Checked_vs_Unchecked.java:45)

    Process finished with exit code 1
         */


        // Checked exceptions

        System.out.println("hello");

        //Thread.sleep(3000);

        System.out.println("Wooden spoon");

        //****************************

        //FileInputStream file = new FileInputStream("path of the file");


        System.out.println("Java".charAt(100)); //unchecked exception



    }



}
