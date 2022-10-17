package day_33_Statics;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name= "Jack";

        Employee employee2 = new Employee();
        employee2.name= "John";

        Employee employee3 = new Employee();
        employee3.name = "Tom";


        //What happen if instance variables were not used in Employee class // it prints last assignment
        //public static String name;
        //System.out.println(employee1.name); // Tom
        //System.out.println(employee2.name); // Tom
        // System.out.println(employee3.name); // Tom

        //What happen if instance variables were  used in Employee class // it prints instances
        //public String name;
        System.out.println(employee1.name); // Jack
        System.out.println(employee2.name); // Jack
        System.out.println(employee3.name); // Tom

    }
}
