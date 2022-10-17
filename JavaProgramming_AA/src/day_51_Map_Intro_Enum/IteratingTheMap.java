package day_51_Map_Intro_Enum;

import java.util.*;

public class IteratingTheMap {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 75);
        students.put("Serkan", 70);
        students.put("Andriy", 98);


/*
        Set<String> keys = students.keySet();
        for (String eachKey : keys) {
            // System.out.println("eachKey = " + eachKey + ", value= " + students.get(eachKey));
            // add every students' score +5
            students.replace(eachKey, students.get(eachKey) + 5);
        }
 */

        System.out.println("students = " + students);

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String> names = students.keySet();

        // print all the students whose score is less than 90
        for (String eachKey : students.keySet()) {
            //System.out.println("key = " + eachKey + ", value = " + students.get(eachKey));
            Integer eachValue = students.get(eachKey);
            if (eachValue < 90) {
                System.out.println("key = " + eachKey + ", value = " + students.get(eachKey));
            }
        }

        System.out.println("---------values()------------");
        Collection<Integer> scores = students.values(); // Collection type
        System.out.println("scores = " + scores);

        List<Integer> scoresList = new ArrayList<>(students.values());
        System.out.println("scoresList = " + scoresList);

        for (Integer value : students.values()) {
            System.out.println("value = " + value);
        }

        System.out.println("-----------------------");
        System.out.println("Maximum and minimum scores");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : students.values()) {
            if (score > maxScore) {
                maxScore = score;
            }

            if (score < minScore) {
                minScore = score;
            }
        }

        System.out.println("minScore = " + minScore);
        System.out.println("maxScore = " + maxScore);

        System.out.println("-----------------------");
        System.out.println("Maximum and minimum scores using Collections.max() and Collections.min()");

        int min = Collections.min(students.values());
        int max = Collections.max(students.values());

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("-----------------------");
        // How many students have 95 or greater score?
        // Using values iteration

        int count = 0;
        for (Integer value : students.values()) {
            if (value >= 95) {
                count++;
            }
        }
        System.out.println("Number of students whose score 95 or greater is " + count);

        // Using key iteration
        int count2 = 0;
        for (String eachKey : students.keySet()) {
            if(students.get(eachKey) >= 95){
                count2++;
            }
        }
        System.out.println("Number of students whose score 95 or greater is " + count2);

        System.out.println("-----------------------");
        System.out.println("----------entrySet()-------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            // System.out.println("entry = " + entry);
            // System.out.println("entry.getKey() = " + entry.getKey());
            // System.out.println("entry.getValue() = " + entry.getValue());

            System.out.println("entry.getKey() = " + entry.getKey() + ", entry.getValue() = " + entry.getValue());

        }

    }
}
