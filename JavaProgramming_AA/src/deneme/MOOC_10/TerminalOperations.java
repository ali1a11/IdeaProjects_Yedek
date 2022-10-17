package deneme.MOOC_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {


        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(-17);
        values.add(-6);
        values.add(8);

        //count()
        System.out.println("Values: " + values.stream().count());

        System.out.println("------------------------------------");

        //forEach()
        values.stream()
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.println(value));

        System.out.println("------------------------------------");

        // collect()

        ArrayList<Integer> positives = values.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        positives.stream()
                .forEach(value -> System.out.println(value));

        System.out.println("------------------------------------");

        // reduce()

        int sum = values.stream()
                .reduce(0, (previousSum, value) -> previousSum + value);
        System.out.println(sum);


    }
}
