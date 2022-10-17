package day_51_Map_Intro_Enum;
        /*
        Given the following map that contains the employee name and their salary:
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        1.1 Who has the maximum salary?
        1.2 Who has the minimum salary?
        1.3 How many employees has the salary between 120K and 150K
        1.4 Display the names of the employees who are making less than 118K.
        1.5 Increase the salary of each employee by 10K if the current salary of employee is less than 120K
         */

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        //1.1 Who has the maximum salary?
        // 1.2 Who has the minimum salary?
        String name1 = "";
        String name2 = "";
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        // 1.3 How many employees has the salary between 120K and 150K
        int count = 0;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();
            Integer eachValue = pair.getValue();

            if (eachValue > maxSalary) {
                maxSalary = eachValue;
                name1 = eachKey;
            }

            if (eachValue < minSalary) {
                minSalary = eachValue;
                name2 = eachKey;
            }

            if (eachValue > 120000 && eachValue < 150000) {
                count++;
            }
        }

        System.out.println("max salary: " + maxSalary + " employee: " + name1);
        System.out.println("min salary: " + minSalary + " employee: " + name2);
        System.out.println("How many employees has the salary between 120K and 150K?:" + count);

        // 1.4 Display the names of the employees who are making less than 118K.
        for (Map.Entry<String, Integer> pairs : map.entrySet()) {
            if (pairs.getValue() < 118000) {
                System.out.println(pairs.getKey());
            }
        }

        System.out.println("-------------------");
        // 1.5 Increase the salary of each employee by 10K if the current salary of employee is less than 120K

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 120000) {
                entry.setValue(entry.getValue() + 10000);
            }
        }

        System.out.println("map = " + map);

    }
}
