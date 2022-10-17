package day_36_OOP_Inheritance_Intro.encapsulation.scrumTask;
/*
	3. Create a sub class of Employee named Tester:

			Add any extra variable or method that Tester object need to have
 */

public class Tester extends Employee{ // Tester is an employee, Tester is a person
    public Tester(String name, int age, char gender, String jobTitle, int ID, double salary, String companyName) {
        super(name, age, gender, jobTitle, ID, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " is creating ticket.");
    }
}
