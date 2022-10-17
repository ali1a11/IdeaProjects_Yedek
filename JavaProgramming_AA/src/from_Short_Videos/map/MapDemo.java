package from_Short_Videos.map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        Map<Integer, String> hashtable = new Hashtable<>();

        Map<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(10, "Arthur");
        hashMap.put(10, "Arthur");
        System.out.println("hashMap = " + hashMap); // hashMap = {10=Arthur} // no duplicate keys

        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Lisa");
        hashMap.put(null, null);

        System.out.println("hashMap = " + hashMap); // random order
        // hashMap = {null=null, 3=Jack, 20=George, 5=Lisa, 40=Emma, 10=Arthur}

        System.out.println("-------------------------------------------------------");

        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Lisa");
        linkedHashMap.put(null, null);

        System.out.println("linkedHashMap = " + linkedHashMap); // insertion order
        // linkedHashMap = {10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Lisa, null=null}

        System.out.println("-------------------------------------------------------");

        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Lisa");
        // hashtable.put(null, null); // does not accept null

        System.out.println("hashtable = " + hashtable); // random order // synchronized
        // hashtable = {10=Arthur, 20=George, 40=Emma, 5=Lisa, 3=Jack}

        System.out.println("-------------------------------------------------------");

        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Lisa");
        // treeMap.put(null, null); // does not accept null

        System.out.println("treeMap = " + treeMap); // ascending order
        // treeMap = {3=Jack, 5=Lisa, 10=Arthur, 20=George, 40=Emma}


    }
}
