package day_36_OOP_Inheritance_Intro.encapsulation.scrumTask;
/*
	6. Create a sub class of Employee named ProductOwner:

			Add any extra variable or method that ProductOwner object need to have
 */


public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, "Product Owner", ID, salary, companyName);  //we set job title "Product Owner" here
    }
}
