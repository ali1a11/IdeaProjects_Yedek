package day_39_Encapsulation_Inheritance_Recap.cydeoTask;
/*
    3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods: createTicket()
 */

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket() {
        System.out.println(getJobTitle() + " " + getName() + " is creating ticket.");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()  + " " + getName() + " is testing the application.");
    }
}
