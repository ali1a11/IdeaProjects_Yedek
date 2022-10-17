package day_20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabets = new char[26];

        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch;
            ch--;
        }
        System.out.println(Arrays.toString(alphabets));

        for (char i = 0, j = 'Z'; i < alphabets.length; i++, j--) {

            alphabets[i] = j;

        }
        System.out.println(Arrays.toString(alphabets));

    }
}
