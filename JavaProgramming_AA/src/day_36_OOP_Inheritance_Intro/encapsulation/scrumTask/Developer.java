package day_36_OOP_Inheritance_Intro.encapsulation.scrumTask;
/*
	4. Create a sub class of Employee named Developer:

			Add any extra variable or method that Developer object need to have
 */

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, jobTitle, ID, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle + " " + name + " is fixing bugs.");
    }


}
