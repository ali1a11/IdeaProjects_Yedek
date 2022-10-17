package day_45_Abstraction_Cont.animalTask;

public final class Cat extends Animal implements Playable, Drinkable{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating biryani" );
    }

    public void Meow(){
        System.out.println(getName() + " is meowing");
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " is playing with mouse.");
    }




}
