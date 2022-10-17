package day_39_Encapsulation_Inheritance_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Developer developer1 = new Developer("John", 25, 'M', 25,"Java Developer", 110000);
        Tester tester1 = new Tester("Tom", 32,'M', 30, "SDET", 125000);
        Teacher teacher1 = new Teacher("Maria", 28, 'F', 29, "Math teacher", 98000);
        Student student1 = new Student("Gerry", 18, 'M', 104, "literature");

        System.out.println(developer1);
        System.out.println(tester1);
        System.out.println(teacher1);
        System.out.println(student1);


        developer1.setAge(41);
        System.out.println(developer1.getAge());

        developer1.work();
        student1.study();
        teacher1.work();

        developer1.eat();

        tester1.createTicket();
    }
}
