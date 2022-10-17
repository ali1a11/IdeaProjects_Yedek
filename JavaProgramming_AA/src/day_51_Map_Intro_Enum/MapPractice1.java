package day_51_Map_Intro_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        // 1. Update the M to Male and F to Female
        /*
        // first way
        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m")){
                employeeMap.replace(key, "Male");
            }

            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");

            }
        }
         */
        // second way
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");
                //employeeMap.replace(entry.getKey(), "Male");
            }

            if(entry.getValue().equalsIgnoreCase("f")){
                entry.setValue("Female");
                //employeeMap.replace(entry.getKey(), "Female");
            }
        }

        System.out.println("employeeMap = " + employeeMap);

        // 2. Display the names of all female employees
        System.out.println("Female employee list");
        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

            String eachKey = entry.getKey();
            String eachValue = entry.getValue();

            if (eachValue.equalsIgnoreCase("female")){
                System.out.println(eachKey);
            }

        }


    }
}
