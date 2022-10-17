package from_Short_Videos.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Generics_Test {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Double[] decimals = {1.2, 3.6, 8.9, 4.25, 8.4, 9.0};
        String[] names = {"James", "Jack", "Emma", "Karen", "David"};

        Generics<Integer> objNumbers = new Generics<>();
        Generics<Double> objDecimals = new Generics<>();
        Generics<String> objString = new Generics<>();

        objNumbers.printEach(numbers);
        objDecimals.printEach(decimals);
        objString.printEach(names);

        // List interface use generics type





    }
}



/*
public class Generics_Test {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Double[] decimals = {1.2, 3.6, 8.9, 4.25, 8.4, 9.0};
        String[] names = {"James", "Jack", "Emma", "Karen", "David"};

        Generics.printEach(numbers);
        Generics.printEach(decimals);
        Generics.printEach(names);


        System.out.println("------------------------");

        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(15, 20, 30, 40, 50, 55));
        ArrayList<Double> scores2 = new ArrayList<>(Arrays.asList(1.2, 0.25, 9.0, 5.5));

        Generics.printEach(scores);
        Generics.printEach(scores2);

    }
}

 */
