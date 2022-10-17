package day_15_ForLoop.Task;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        System.out.println("Enter a text to be reversed: ");

        String text = new Scanner(System.in).nextLine();

        int length = text.length();
        for (int i = length-1; i >=0 ; i--) {
            System.out.print(text.charAt(i));

        }
    }
}
