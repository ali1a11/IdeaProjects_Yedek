package day_36_OOP_Inheritance_Intro.encapsulation.scrumTask;
/*
	7. Create a sub class of Employee named ScrumMaster:
			Add any extra variable or method that ScrumMaster object need to have
 */

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, "Scrum master", ID, salary, companyName); //we set job title "Scrum master" here
    }
}
