package deneme.MOOC_9.ObjectPolymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        int number = 9;

        String[] array = {"1", "2", "3"};

        String string = " o ";
        List<String> words = new ArrayList<>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        printer.printManyTimes(string, 2);
        printer.printManyTimes(words, 3);
        printer.printManyTimes(number,3);
        printer.printManyTimes(Arrays.toString(array), 2);

        String string2 = "works";

        printer.printCharacters(string2);
    }
}
