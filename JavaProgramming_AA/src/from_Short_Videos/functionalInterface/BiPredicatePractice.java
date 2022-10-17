package from_Short_Videos.functionalInterface;


import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicatePractice {
    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, number) -> {
            boolean result = false;

            for (int each : arr) {
                if (number == each) {
                    result = true;
                    break;
                }
            }
            return result;
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("contains.test(arr, 9) = " + contains.test(arr,9)); // contains.test(arr, 9) = false

    }
}
