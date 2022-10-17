package day_45_Abstraction_Cont.animalTask;

public final class Parrot extends Animal implements Playable, Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating chocolate");

    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is playing with bird");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " can fly 20km/h.");
    }
}
