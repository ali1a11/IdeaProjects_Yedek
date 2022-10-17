package day_51_Map_Intro_Enum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice4 {
    public static void main(String[] args) {

        Map<Integer, ArrayList<String>> groups = new TreeMap<>(); // to order TreeMap
        /*
        Map<Integer, String[]> groups = new TreeMap<>(); // to order TreeMap
        String[] group1 = {"Duygu","Magda","Farangez","Edison", "Kerem", "Farangis"};
        String[] group2 = {"Margie", "Vesele", "Iryn", "Nilifuer", "Aziza", "Nurcan", "Reika", "Igor", "Elif", "Sana", "Azamat"};
        String[] group9 = {"Alex", "Ali", "Andriy", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem"};
        String[] group24 = {"Maira", "Kristina", "Amin", "George", "Layan", "Amin", "Yulia", "George", "Ayanle", "Maxim", "Nermin", "Douglas"};
        String[] group5 = {"Nazar", "Veronika", "Mikael", "Layla", "Badma", "Zaeir", "Anna", "Tamara", "Eugene"};

        // pair group ID and names of student

        groups.put(1, group1);

        System.out.println(Arrays.toString(groups.get(1)));
        */
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Duygu", "Magda", "Farangez", "Edison", "Kerem", "Farangis"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Margie", "Vesele", "Iryn", "Nilifuer", "Aziza", "Nurcan", "Reika", "Igor", "Elif", "Sana", "Azamat"));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList("Alex", "Ali", "Andriy", "Cassandra", "Sevgul", "Olha", "Tito", "Ozan", "Serkan", "Furkan", "Madina", "Muharrem"));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList("Maira", "Kristina", "Amin", "George", "Layan", "Amin", "Yulia", "George", "Ayanle", "Maxim", "Nermin", "Douglas"));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar", "Veronika", "Mikael", "Layla", "Badma", "Zaeir", "Anna", "Tamara", "Eugene"));

        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(9, group9);
        groups.put(24, group24);
        groups.put(5, group5);

        System.out.println("groups.size() = " + groups.size());
        System.out.println("groups = " + groups);

        System.out.println("Names of the students in group 9");

        for (String each : groups.get(9)) {
            System.out.println(each);
        }

        System.out.println("Second student in group 2");

        System.out.println("groups.get(2).get(1) = " + groups.get(2).get(1));

        // Print all students in groups map
        System.out.println("Print all students in groups map");
        for (ArrayList<String> eachGroup : groups.values()) {
            for (String eachName : eachGroup) {
                System.out.println(eachName);
            }
        }
    }
}
