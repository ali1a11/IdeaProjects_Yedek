package from_Short_Videos.super_keyword;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Lucy", "Husky", 'F', 2, "large", "White");

        dog.bark();
        dog.sleep();
        System.out.println(dog);

        Cat cat = new Cat("Jerry", "Ragdoll", 'M', 5, "small", "Gray" );

        cat.scratch();
        cat.sleep();
        System.out.println(cat);

        Fish fish = new Fish("Nemo","Golden",'M',1,"small","Yellow");

        fish.swim();
        fish.sleep();
        System.out.println(fish);

    }
}
