package from_Short_Videos.functionalInterface;

import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {

        Consumer<int[]> printEach = n-> {
            for (int each : n) {
                System.out.println(each);
            }
        };
        int[] numbers = {2, 5, 6, 8, 9};

        printEach.accept(numbers);

    }
}
