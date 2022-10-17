package day_30_Custom_Class;
/*
Attributes: name, ID, gender, age, jobTitle, salary, isFullTime(boolean)
Actions: toString(), setInfo, work()

create 5 employee objects
store those objects into an array
How many employees are full time employees
What is the minimum salary?
What is the maximum salary?
 */


public class Employee {

    public String name;
    public int id;
    public char gender;
    public int age;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;


    public void setInfo(String name, int id, char gender, int age, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                ", age=" + age +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working");
    }
}
