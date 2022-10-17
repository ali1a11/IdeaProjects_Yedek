package from_Short_Videos.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Iteration {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "Arthur");
        map.put(20, "George");
        map.put(3, "Jack");
        map.put(40, "Emma");
        map.put(5, "Lisa");

        System.out.println("----------iterating by keys. keySet() --------------");

        for (Integer eachKey : map.keySet()) {
            System.out.println(eachKey);
        }

        System.out.println("----------iterating by values. values() --------------");

        for (String eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("----------iterating by entry. entrySet() --------------");

        for (Map.Entry<Integer, String> eachEntry : map.entrySet()) {
            System.out.println("eachEntry = " + eachEntry);
            System.out.println("eachEntry.getKey() = " + eachEntry.getKey());
            System.out.println("eachEntry.getValue() = " + eachEntry.getValue());

        }

    }
}
