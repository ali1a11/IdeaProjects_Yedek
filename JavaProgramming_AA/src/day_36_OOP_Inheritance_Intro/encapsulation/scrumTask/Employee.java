package day_36_OOP_Inheritance_Intro.encapsulation.scrumTask;
/*
	2. Create a sub class of Person named Employee
		Extra variables:
				id, jobTitle, salary

		Extra methods:
			SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
			Hint: after creating setInfo method of employee class, you can call the inherited setInfo() to set the name, age, and gender

			work()

toString(): generate toString seperately in Employee class so that name, age, gender, id, jobTitle and salary of the employee can be displayed


 */

import day_37_Inheritance_Cont.animalTask.Parrot;

public class Employee extends Person {
    public String jobTitle;
    public int ID;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(name + " is working at the " + companyName + " as a " + jobTitle);
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
