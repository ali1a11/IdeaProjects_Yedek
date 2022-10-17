package deneme.MOOC_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Stream2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        double average = 0;

        average = numbers.stream().mapToDouble(s->s).average().getAsDouble();

        System.out.println("average = " + average);
    }
}
