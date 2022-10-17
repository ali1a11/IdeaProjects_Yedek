package from_Short_Videos.collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        Set<Integer> treeSet = new TreeSet<>();

        hashSet.addAll(Arrays.asList(1, 20, 3, 40, 5, 6));
        hashSet.addAll(Arrays.asList(1, 20, 3, 40, 5, 6));
        linkedHashSet.addAll(Arrays.asList(1, 20, 3, 40, 5, 6));
        linkedHashSet.addAll(Arrays.asList(1, 20, 3, 40, 5, 6));
        treeSet.addAll(Arrays.asList(1, 20, 3, 40, 5, 6));
        treeSet.addAll(Arrays.asList(1, 20, 3, 40, 5, 6));

        System.out.println("hashSet = " + hashSet); // hashSet = [1, 3, 20, 5, 6, 40] // random order // no duplicate
        System.out.println("linkedHashSet = " + linkedHashSet); // linkedHashSet = [1, 20, 3, 40, 5, 6] // insertion order // no duplicate
        System.out.println("treeSet = " + treeSet); // treeSet = [1, 3, 5, 6, 20, 40] // treeSet = [1, 3, 5, 6, 20, 40] // ascending order // no duplicate

        // no index number

        System.out.println("----------------------------");
        for (Integer each : hashSet) {
            System.out.println(each);
        }

        System.out.println("----------------------------");

        for (Integer each : linkedHashSet) {
            System.out.println(each);
        }

        System.out.println("----------------------------");

        for (Integer each : treeSet) {
            System.out.println(each);
        }

    }
}
