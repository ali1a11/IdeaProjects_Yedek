package day_19_LoopPractices;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            System.out.println("Hello World"); //Without curly braces only one statement repeats
            System.out.println("Java"); // It will be printed only one time

        for (int i = 0; i < 5; i++)
            System.out.println("Repeat");

        for (int i = 0; i < 5; i++) {
            System.out.println("It is better to use curly braces!!!");
        }
        
    }
}
