package week24_07_2022.constructors;

import java.util.ArrayList;

public class Microsoft {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        System.out.println(employee1);

        employee1.name = "Ersin";
        employee1.ID = 103;
        employee1.jobTitle = "technical manager";

        Employee employee2 = new Employee("Jack","QA leader", 114, 110000);

        System.out.println(employee2);

        ArrayList<Employee> team = new ArrayList<>();

        team.add(employee1);
        team.add(employee2);

        team.add(new Employee("John", "SDET", 300, 95000));

        System.out.println(team);

        //find max salary from team list

        double maxSalary = Double.MIN_VALUE;

        for (Employee each : team) { // each is an Employee object

            if(each.salary > maxSalary){
                maxSalary = each.salary;
            }

        }
        System.out.println("maxSalary = " + maxSalary);

        // job title of Jack s title

        for (Employee each : team) {

            if(each.name.equalsIgnoreCase("Jack")){
                System.out.println(each.jobTitle);
            }
        }

        // company name for each employee

        for (Employee each : team) {
            System.out.println(each.name + " is working for " + each.companyName);
        }

        employee1.companyName = "Tesla";// it makes changes to every employees ( because companyName is static)

        //Note: You can change or call static field through object or ClassName, but second one maybe preferable


        for (Employee each : team) {
            System.out.println(each.name + " is working for " + each.companyName);
        }
        /*
        Ersin is working for Tesla
        Jack is working for Tesla
        John is working for Tesla
         */
    }

}
