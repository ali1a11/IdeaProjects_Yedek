package from_Short_Videos.functionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class BiConsumerPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);

        map.forEach((k, v) -> {
            System.out.println("key: " + k + " value: " + v);
        });

        System.out.println("---------------------------");

        map.forEach((k, v) -> {
            if (v > 20) {
                System.out.println(v);
            }
        });

    }
}
