package day_03;
/*
Escape sequences: MUST be given with double quote
    \n: starts a new line
    \t: paragraph space(tab)
    \\: single back slash
    \": double quote
 */

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("New line\nNew line");
        System.out.println();
        System.out.println("Horizontal tab\tHorizontal tab");
        System.out.println();
        System.out.println("Backslash\\backslash\t\\"); // in order to print one backward slash we need to give two backward slashes
        System.out.println();
        System.out.println("Programming language is \"Java\"");
        System.out.println();
        System.out.println("Hello Everybody! How are you all today? It is nice to see you.");
        System.out.println();
        System.out.println("Hello Everybody!\nHow are you all today?\nIt is nice to see you.");
        System.out.println();
        System.out.println("Hello Everybody!\n\tHow are you all today?\n\t\tIt is nice to see you.");
        System.out.println();
        System.out.println("My favorite TV is \"NRK\""); // in order to print " use \"

    }
}