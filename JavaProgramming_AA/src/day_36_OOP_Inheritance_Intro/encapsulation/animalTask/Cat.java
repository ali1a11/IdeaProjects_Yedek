package day_36_OOP_Inheritance_Intro.encapsulation.animalTask;

// Cat is an animal
// Cat class is child class
// Animal class is parent class

public class Cat extends Animal {

    public void meow(){
        System.out.println(name + " is meowing.");
    }

    public void scratch() {
        System.out.println(name + " is scratching.");
    }
}
