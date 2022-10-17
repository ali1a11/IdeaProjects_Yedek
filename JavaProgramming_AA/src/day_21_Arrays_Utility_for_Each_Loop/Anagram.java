package day_21_Arrays_Utility_for_Each_Loop;

//Wtrite a program that can check if str1 & str2 are build out same characters

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1)); // [a, c, d, b]
        System.out.println(Arrays.toString(ch2)); // [d, b, c, a]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);

        //
        String sentence = "Hello World. How is everything?";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words)); //[Hello, World., How, is, everything?]

        //
        String eMail = "hello@example.com";

        String [] arr = eMail.split("@");

        System.out.println(Arrays.toString(arr)); //[hello, example.com]

        //
        String s = "Today is a nice day. Today is Monday. Today we learn Java.";

        String[] sentences = s.split("\\."); // for . "\\."

        System.out.println(Arrays.toString(sentences)); //[Today is a nice day,  Today is Monday,  Today we learn Java]

    }
}
