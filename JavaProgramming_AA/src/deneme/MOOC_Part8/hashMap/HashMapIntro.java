package deneme.MOOC_Part8.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {
    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();

        HashMap<String, String> capitalCities = new HashMap<>();

        //adding keys and values (Country, CapitalCity)

        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("England", "London");
        capitalCities.put("France", "Paris");

        // Accessing a value
        // get()
        System.out.println(capitalCities.get("Norway")); // Oslo

        // Remove an item
        // remove()

        capitalCities.remove("England");

        // Remove all items
        // clear() //capitalCities.clear();

        // To find out howmany items there are
        // size()

        System.out.println(capitalCities.size()); // 3

        // loop for keys

        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        // loop for values

        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        // loop for printing keys and values
        for (String key : capitalCities.keySet()) {
            System.out.println("key: " + key + " value: " + capitalCities.get(key));
        }


        // adding keys and values (name, age)
        people.put("Tom", 25);
        people.put("Laura", 22);
        people.put("George", 35);

        // printing keys and values

        for (String key : people.keySet()) { //people.keySet()  // shortcut people.keySet().for
            System.out.println("Key: " + key + " value: " + people.get(key));
        }

        System.out.println("-----------------------------");

        // another way
        for(Map.Entry<String, Integer> entry : people.entrySet()){
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }

    }
}
