package day_51_Map_Intro_Enum;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //    key  , value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Ahmet"); // key cannot be duplicated. Last one is accepted, previous ones will be removed
        hashMap.put(7, "Ahmet");
        hashMap.put(null, "Cihad");
        hashMap.put(null, "Emre");
        hashMap.put(null, null); // null key and value are accepted, but not duplicated keys // can be more than one null value
        hashMap.put(8, null); // null key and value are accepted, but not duplicated keys // can be more than one null value


        // order is not guaranteed
        System.out.println("hashMap = " + hashMap); // hashMap = {null=null, 3=Jack, 20=George, 5=Ahmet, 7=Ahmet, 40=Emma, 8=null, 10=Arthur}

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella"); // No duplicated keys last one is accepted
        linkedHashMap.put(null, "Hulya");

        // insertion order is kept
        System.out.println("linkedHashMap = " + linkedHashMap); // linkedHashMap = {10=Arthur, 20=George, 3=Jack, 40=Emma, 5=Isabella, null=Hulya}

        // sorted order
        // key cannot be null
        // no accept null key -> NullPointer Exception
        // null value is OK
        Map<Integer, String> treemap = new TreeMap<>();
        treemap.put(10, "Arthur");
        treemap.put(20, "George");
        treemap.put(3, "Jack");
        treemap.put(40, "Emma");
        treemap.put(5, "Ahmet");
        treemap.put(5, "Isabella"); // No duplicated keys last one is accepted
        treemap.put(8, null); // null value is OK

        // treemap has sorted order
        System.out.println("treemap = " + treemap); //treemap = {3=Jack, 5=Isabella, 8=null, 10=Arthur, 20=George, 40=Emma}

        // key and value cannot be null in Hashtable
        // no accept null key -> NullPointer Exception
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5, "Isabella");

        System.out.println("hashtable = " + hashtable);

    }
}
