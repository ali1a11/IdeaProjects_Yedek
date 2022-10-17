package week24_07_2022.constructors;
/*
ask 1:
Employee:
    attribute/fields/variables
name, jobTitle, ID, salary

    add a constructor to initialize all the fields
    add a default constructor with no fields

    toString() method will rint out the fields
 */

public class Employee {
    public String name, jobTitle;
    public int ID;
    public double salary; // instance variable, belongs to object

    public static String companyName; // static field, belongs to class

    static {
        companyName ="Microsoft";
    }

    public Employee() {
        salary = 10000;
    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", company name=" + companyName +
                '}';
    }
}
