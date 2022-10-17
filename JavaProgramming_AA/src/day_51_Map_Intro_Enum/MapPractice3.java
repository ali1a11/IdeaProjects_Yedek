package day_51_Map_Intro_Enum;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Tom", 145000);
        map.put("Karen", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 145000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        //Display the names of the employees who has the maximum salaries

        int maxSalary = Integer.MIN_VALUE;

        for (Integer value : map.values()) {
            if (value > maxSalary) {
                maxSalary = value;
            }
        }

        int max = Collections.max(map.values());

        System.out.println("maxSalary = " + maxSalary);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() == maxSalary){
                System.out.println("pair.getKey() = " + pair.getKey());
            }
        }


    }
}
