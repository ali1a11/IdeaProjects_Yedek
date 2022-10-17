package day_36_OOP_Inheritance_Intro.encapsulation.animalTask;

// Tiger is an animal
// Tiger class is child class
// Animal class is parent class

public class Tiger extends Animal{

    public void hunt(){
        System.out.println(name + " is hunting.");
    }

    public void roar(){
        System.out.println(name + " is roaring.");
    }
}
