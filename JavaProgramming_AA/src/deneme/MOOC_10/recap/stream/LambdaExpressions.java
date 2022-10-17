package deneme.MOOC_10.recap.stream;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExpressions {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //numbers.stream().filter(n->n>5).

        double average = numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();


        System.out.println("average = " + average);

        // is the same as
        double average2 = numbers.stream()
                .filter((Integer value) -> {
                    if (value > 5) {
                        return true;
                    }

                    return false;
                }).mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("average2 = " + average2);

/*
The same can be written explicitly so that a static method is defined in the program,
which gets used within the function passed to the stream as a parameter.

public class Screeners {
    public static boolean greaterThanFive(int value) {
        return value > 5;
    }
}
*/

/*
// original
*stream*.filter(value -> value > 5).*furtherAction*

// is the same as
*stream*.filter(value -> Screeners.greaterThanFive(value)).*furtherAction*
*/

/*
The function can also be passed directly as a parameter.
The syntax found below Screeners::greaterThanFive is saying: "use the static greaterThanFive method that's in the Screeners class".

// is the same as
*stream*.filter(Screeners::greaterThanFive).*furtherAction*
 */


    }
}
