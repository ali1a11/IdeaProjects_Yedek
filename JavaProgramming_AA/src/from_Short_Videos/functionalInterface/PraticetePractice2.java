package from_Short_Videos.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PraticetePractice2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9));
/*
        Predicate<Integer> isEven = (x) -> {
            return x % 2 == 0;
        };
 */
        Predicate<Integer> isEven = x -> x % 2 == 0;

        list.removeIf(isEven);
        System.out.println("list = " + list);

    }
}
