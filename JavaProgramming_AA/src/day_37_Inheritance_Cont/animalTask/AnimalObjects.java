package day_37_Inheritance_Cont.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alex", "husky", 'M', 1, "small", "white");
        System.out.println("dog1 = " + dog1);
        dog1.bark();

        Cat cat1 = new Cat("Love", "Siamese", 'F', 2, "large", "black");
        System.out.println("cat1 = " + cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 3, "small", "blue", "red and blue");
        System.out.println("parrot1 = " + parrot1);
        parrot1.sing();
    }
}
