package day_32_CustomClass_Constructor;

public class Employee {
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name) { //constructor name has to be same with class name
        this.name = name;
    }

    public Employee(String name, char gender) { //overloading //constructor name has to be same with class name
        //to calling to other constructor this() // we can call the constructors by their name
        this(name); //this.name = name; // if you use more than one constructor avoid duplication of code fragments
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name, gender); // calls previous constructor
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary) {
        this(name, gender, jobTitle); // calls previous constructor
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
