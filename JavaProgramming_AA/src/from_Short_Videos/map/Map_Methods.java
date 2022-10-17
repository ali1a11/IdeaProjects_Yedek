package from_Short_Videos.map;

import java.util.LinkedHashMap;

public class Map_Methods {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        
        // put()
        map.put(10, "Arthur");
        map.put(20, "George");
        map.put(3, "Jack");
        map.put(40, "Emma");
        map.put(5, "Lisa");

        System.out.println("map = " + map); // map = {10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Lisa}

        // size()
        System.out.println("----------------------------size()----------------------------");
        System.out.println("map.size() = " + map.size()); // map.size() = 5

        // get(key)
        System.out.println("----------------------------get(key)----------------------------");
        System.out.println("map.get(20) = " + map.get(20)); // map.get(20) = George

        // replace(key, value)
        System.out.println("----------------------------replace(key, value)----------------------------");
        map.replace(10, "James");
        System.out.println("map = " + map); // map = {10=James, 20=George, 3=Jack, 40=Emma, 5=Lisa}

        // remove(key)
        System.out.println("----------------------------remove(key)----------------------------");
        map.remove(10);
        System.out.println("map = " + map); // map = {20=George, 3=Jack, 40=Emma, 5=Lisa}

        // containsKey(key)
        System.out.println("----------------------------containsKey(key)----------------------------");
        System.out.println("map.containsKey(28) = " + map.containsKey(28)); // map.containsKey(28) = false
        System.out.println("map.containsKey(20) = " + map.containsKey(20)); // map.containsKey(20) = true

        // containsValue(value)
        System.out.println("----------------------------containsValue(value)----------------------------");
        System.out.println("map.containsValue(\"Jack\") = " + map.containsValue("Jack")); // map.containsValue("Jack") = true

        // isEmpty()
        System.out.println("----------------------------isEmpty()----------------------------");
        System.out.println("map.isEmpty() = " + map.isEmpty()); // map.isEmpty() = false

        // equals(MapObject)
        System.out.println("----------------------------equals(MapObject)----------------------------");
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(20, "George");
        map2.put(3, "Jack");
        map2.put(40, "Emma");
        map2.put(5, "Lisa");

        System.out.println("map.equals(map2) = " + map.equals(map2)); // map.equals(map2) = true
        // clear()
        System.out.println("----------------------------clear()----------------------------");
        map.clear();
        System.out.println("map = " + map);
        System.out.println("map.size() = " + map.size());

    }
}
