package day_35_OOP_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jack", 'M', 25, 90000);

        System.out.println(employee1);


        Employee employee2 = new Employee("", 'F', 5, -10);

        System.out.println(employee2);

        employee1.setAge(32);
        System.out.println(employee1);

        employee1.setSalary(employee1.getSalary()+ 15000);
        System.out.println(employee1);



    }
}
