package week_17_28_08_2022;

public class TestEdible {
    public static void main(String[] args) {

        // Object[] objects = {new Tiger(), new Chicken(), new Apple()}; // no references

        //intanceof

        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();
        Apple apple = new Apple();

        Object[] objects = {tiger, chicken, apple}; // references
/*
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Edible){
                ((Edible) objects[i]).howToEat();
            }
        }
*/
        tiger.sound();
        chicken.sound();
        chicken.howToEat();
        apple.howToEat();

        Edible.staticMethod(); // we can call static method in interface

    }
}

// other classes

interface Edible {
    // describes how to eat
    String howToEat(); // public abstract implicitly

    default void someMethod(){
        System.out.println("Default method in interface");
    }

    static void staticMethod() {
        System.out.println("Sitatic method in interface");
    }

}

interface moreInterface {
    void moreMethod();
}
abstract class Animal {
    //return animal sound
    public abstract String sound(); // we have to put abstract keyword

}

class Chicken extends Animal implements Edible{

    @Override
    public String sound() {
        return "Chicken: cik cik cik ";
    }

    @Override
    public String howToEat() {
        return "Chicken style";
    }
}

class Tiger extends Animal{

    @Override
    public String sound() {
        return "Tiger: roar";
    }
}

abstract class Fruit implements Edible{ // implementing abstract methds in interface is optional for abstract class

}
class Apple extends Fruit{


    @Override
    public String howToEat() {
        return "Apple: Make apple cide and drink";
    }
}

class Orange extends Fruit{

    @Override
    public String howToEat() {
        return "Orange: make orange juice";
    }

}

