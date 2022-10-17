package week_13_31_07_2022;

public class Person {
    private String firstName,lastName;
    private int age;

    public Person(){ // default constructor
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;

    }

    public Person(String firstName, String lastName, int age) { // constructor with 3 parameters
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }



    public static void main(String[] args) {
        Person person1 = new Person("Mike", "White", 25);
        System.out.println(person1.getFirstName());

    }

}
