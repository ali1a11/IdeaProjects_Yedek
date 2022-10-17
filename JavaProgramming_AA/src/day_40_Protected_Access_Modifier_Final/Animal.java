package day_40_Protected_Access_Modifier_Final;

public class Animal {
    private String name;  // it can change
    private final String breed;  // it cannot change
    private final char gender;  // it cannot change
    private final String color;  // it cannot change
    private String size; // it can change
    private int age; // it can change


    // there cannot be setter methods for final variables
    // But it is possible to generate getters for final variables


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    // There is no setters for final variables
    // we cannot generate setter for final variables that are initialized when they are created with constructor
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    //Methods
    public void eat(){ // implementation of this method can be changeable (with override)
        System.out.println(name + " is eating.");
    }

    public final void drink(){ // implementation of this method is unchangeable (cannot be overriden)
        System.out.println(name + " is drinking.");
    }

}
