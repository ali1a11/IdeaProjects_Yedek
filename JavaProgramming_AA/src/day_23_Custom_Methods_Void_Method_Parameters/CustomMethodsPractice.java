package day_23_Custom_Methods_Void_Method_Parameters;

public class CustomMethodsPractice {
    // create a function that can print hello world 5 times helloWorld5Times()

    // create a function that can print hello cats 5 times  helloCats5Times()

    public static void main(String[] args) {
        //helloWorld5Times();
        //helloCats5Times();
        evenNumbers();
    }

    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }

    public static void helloCats5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cats");
        }

    }

    // create a function that can print all the even numbers from 1 to 10 -> evenNumbers
    public static void evenNumbers() {
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
        }
    }


}
