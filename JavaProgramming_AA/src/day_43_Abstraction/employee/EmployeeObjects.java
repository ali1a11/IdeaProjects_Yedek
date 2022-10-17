package day_43_Abstraction.employee;

public class EmployeeObjects {
    public static void main(String[] args) {

        // Person person = new Person("John", 35, 'M'); // we cannot create object from abstract class

        Tester tester = new Tester("Tom", 25, 'M', 25, "SDET", 100000);
        Developer developer = new Developer("Karen", 27, 'F', 32, "senior dev.", 125000);
        Teacher teacher = new Teacher("Janet", 32, 'F', 28, "English teacher", 99000);
        Driver driver = new Driver("Tim", 34, 'M', 20, "Truck driver", 89000);
        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("------------------");
        developer.work();
        developer.sleep();
        developer.unitTest();
        developer.eat();

        System.out.println("------------------");
        teacher.work();
        teacher.sleep();
        teacher.eat();



    }
}
