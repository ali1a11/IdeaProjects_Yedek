package day_36_OOP_Inheritance_Intro.encapsulation.scrumTask;
/*
	5. Create a sub class of Employee named BusinessAnalyst:

			Add any extra variable or method that BusinessAnalyst object need to have
 */

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", ID, salary, companyName); //we set job title "Business Analyst" here
    }

    public void analyze(){
        System.out.println(name + " is analyzing the documents.");
    }

}
