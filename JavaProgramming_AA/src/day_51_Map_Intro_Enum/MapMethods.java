package day_51_Map_Intro_Enum;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        // student name & score

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);
        students.put("Maria", 86);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);
        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87); // no duplication, removes previous


        System.out.println("students = " + students);
        System.out.println("students.size() = " + students.size());

        System.out.println();
        // display the score of Alex
        System.out.println("students.get(\"Alex\") = " + students.get("Alex"));
        System.out.println();

        System.out.println("------- replace()-------------- ");
        // replace Ali's score to 90
        students.replace("Ali", 90);
        System.out.println("students = " + students);

        System.out.println("------- remove()-------------- ");
        // remove Alex
        students.remove("Alex");
        // key and its value are removed
        System.out.println("students = " + students);

        System.out.println("------- containsKey()-------------- ");
        boolean r1 = students.containsKey("Muhtar");
        System.out.println(r1);
        System.out.println("students.containsKey(\"Muhtar\") = " + students.containsKey("Muhtar"));
        System.out.println("students.containsKey(\"Ozan\") = " + students.containsKey("Ozan"));

        System.out.println("------- containsValue()-------------- ");
        boolean r2 = students.containsValue(100);
        System.out.println(r2);
        System.out.println("students.containsValue(98) = " + students.containsValue(98));

        System.out.println("------- isEmpty()-------------- ");
        System.out.println("students.isEmpty() = " + students.isEmpty());

        System.out.println("------- equals()-------------- ");
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println("map1.equals(map2) = " + map1.equals(map2));

        System.out.println("------- clear()-------------- ");
        map1.clear();
        map2.clear();

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);


    }
}
