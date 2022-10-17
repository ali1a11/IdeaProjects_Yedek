package day_45_Abstraction_Cont.animalTask;

public final class Dog extends Animal implements Playable {


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Pizza");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is playing with ball.");
    }
}
