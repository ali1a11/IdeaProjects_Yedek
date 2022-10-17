package day_36_OOP_Inheritance_Intro.encapsulation.employeeTask;
/*
	Employee:
		name, gender, age, jobTitle, id, salary, companyName
		setInfo(), work(), toString()
 */

public class Employee {
    public String name;
    public char gender;
    public int age;
    public String jobTitle;
    public int ID;
    public double salary;

    public static String companyName;

    static {
        companyName = "ANCCompany";
    }

    public void work(){
        System.out.println(name + " is working at the " + companyName + " as a " + jobTitle);
    }

    public void setInfo(String name, char gender, int age, String jobTitle, int ID, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}
