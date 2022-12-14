package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name cannot be empty and name should be maximum 40 characters.");
        }
        this.name = name;

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age should be between 0 and 120");
        }

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
