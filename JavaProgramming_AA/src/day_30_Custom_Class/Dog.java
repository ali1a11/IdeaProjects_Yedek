package day_30_Custom_Class;
/*
Attributes: name, age, gender, breed, size, color, ...

Actions: eat(), play(), bark(), ...
 */

public class Dog {
    // instance variables // each object has separate copy of the variable
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;


    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor) {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }


    public void eat(){ // to each object can use this method not static
        System.out.println(name + " is eating");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
/*
    public String toString() {
        return "Name :" + name;
    }
 */

    // IntelliJ shortcut
    // to generate toString() method
    // sag tik + generate + toString()


    public String toString() { // with using IntelliJ shortcut
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
