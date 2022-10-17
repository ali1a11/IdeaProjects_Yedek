package day_45_Abstraction_Cont.animalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating snake");
    }

    @Override
    public void hunt() {
        System.out.println(this.getName() + " hunts snake");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " can fly 50km/h.");
    }
}
