package day_35_OOP_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Daniel");
        person1.setAge(26);

        System.out.println(person1.getName());
        System.out.println(person1.getAge());


    }
}
