package day_40_Protected_Access_Modifier_Final;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky",'M', "white", "large", 2);

        // Dog is a final class
        // Dog class has some final inherited variables from Animal class
        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();

    }
}
