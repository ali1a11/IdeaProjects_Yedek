package day_36_OOP_Inheritance_Intro.encapsulation.employeeTask;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        Tester tester1 = new Tester();
        tester1.setInfo("Jack", 'M', 26, "QA", 1235, 112000);
        tester1.work();
        System.out.println(tester1);

        Developer developer1 = new Developer();
        developer1.setInfo("Karia", 'F', 32, "Master developer", 124,140000);
        developer1.work();
        System.out.println(developer1);
    }
}
