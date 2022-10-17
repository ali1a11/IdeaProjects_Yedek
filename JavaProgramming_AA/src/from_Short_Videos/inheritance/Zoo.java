package from_Short_Videos.inheritance;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.name = "Lucy";
        dog.breed = "Husky";
        dog.gender = 'F';
        dog.age = 2;
        dog.size = "large";
        dog.color = "White";

        dog.bark();
        dog.sleep();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.name = "Jerry";
        cat.breed = "Ragdoll";
        cat.gender = 'M';
        cat.age = 5;
        cat.size = "small";
        cat.color = "Gray";
        
        cat.scratch();
        cat.sleep();
        System.out.println(cat);

        Fish fish = new Fish();
        fish.name = "Nemo";
        fish.breed = "Golden";
        fish.gender = 'M';
        fish.age = 1;
        fish.size = "small";
        fish.color = "Yellow";

        fish.swim();
        fish.sleep();
        System.out.println(fish);

    }
}
