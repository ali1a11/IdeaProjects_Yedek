package deneme.MOOC_10.recap.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);

        ArrayList<Integer> values = list.stream()
                .filter(value -> value > 5)
                .map(value -> value * 2).collect(Collectors.toCollection(ArrayList::new));

        System.out.println("list = " + list);
        System.out.println("values = " + values);

        System.out.println("Number of element in the list: " + list.stream().count());
        System.out.println("Number of element in the values list: " + values.stream().count());

        System.out.println("Print each number in the list");
        list.stream()
                .forEach(System.out::println);

        System.out.println("In the list print the numbers that are divisible by two.");
        list.stream()
                .filter(n->n%2==0)
                .sorted()
                .forEach(n-> System.out.println(n));

/*
The reduce method is useful when you want to combine stream elements to some other form.
The parameters accepted by the method have the following format: reduce(*initialState*, (*previous*, *object*) -> *actions on the object*).
 */

        int sum = list.stream()
                .reduce(0, (previousSum, value)-> previousSum + value);

        System.out.println("sum = " + sum);

/*
In the same way, we can form a combined row-separated string from a list of strings.
*/
        ArrayList<String> words = new ArrayList<>();
        words.add("First");
        words.add("Second");
        words.add("Third");
        words.add("Fourth");

        String combined = words.stream()
                .reduce("", (previousString, word) -> previousString + word +  "\n");
        System.out.print(combined);

    }
}
