package from_Short_Videos.functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerPractice {
    public static void main(String[] args) {

        BiConsumer<String, Integer> printMulipleTimes = (s, n) -> {
            for(int i = 0; i<n; i++){
                System.out.println(s);
            }
        };

        printMulipleTimes.accept("Hello", 3);

    }
}
