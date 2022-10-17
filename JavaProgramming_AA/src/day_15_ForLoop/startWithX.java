package day_15_ForLoop;
/*
Warmup tasks:
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */

import java.util.Scanner;

public class startWithX {
    public static void main(String[] args) {


        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next(); //if you get one input from user (if Scanner object will be used one time)

        if(word.charAt(0)=='x'){
            word = word.replaceFirst("x", "a");

            System.out.println("word = " + word);
        }

    }
}
