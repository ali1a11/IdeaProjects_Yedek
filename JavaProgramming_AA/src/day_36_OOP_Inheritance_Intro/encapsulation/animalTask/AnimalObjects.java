package day_36_OOP_Inheritance_Intro.encapsulation.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setInfo("Max", "husky", 'M',2,"small", "white");
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();
        
        dog1.bark();

        System.out.println("dog1 = " + dog1);

        Cat cat1 = new Cat();
        cat1.setInfo("Kettty", "british", 'F', 4, "small", "black");

        cat1.eat();
        cat1.sleep();
        cat1.move();
        
        cat1.meow();
        cat1.scratch();

        System.out.println("cat1 = " + cat1);

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("SherKhan", "Bengal", 'M', 4, "large", "red");
        tiger1.eat();
        tiger1.sleep();
        tiger1.drink();

        tiger1.roar();
        tiger1.hunt();

        System.out.println("tiger1 = " + tiger1);

    }
}
