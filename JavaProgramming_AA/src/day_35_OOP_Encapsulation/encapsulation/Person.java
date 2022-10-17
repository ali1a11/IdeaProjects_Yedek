package day_35_OOP_Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;


    // with using encapsulation (private instance variable and public setter and getter) we can control over variable
    // for example we can define rules for name variable
    // for example must not be integer or empty
    // if it is public we can not use conditions restrictions easily

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            System.out.println("Invalid age " + age);
            System.exit(0);
        }
        this.age = age;
    }
}
