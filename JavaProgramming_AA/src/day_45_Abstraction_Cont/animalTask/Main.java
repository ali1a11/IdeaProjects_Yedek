package day_45_Abstraction_Cont.animalTask;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Kucu kucu", "comar", 'M', 6, "big", "white");

        System.out.println(dog);


        Cat cat = new Cat("Kettie","bengal", 'F', 4, "big", "brown");
        cat.drink();
        cat.drink2(); // default method interited from Drinkable

        Drinkable.method9(); // static method interited from Drinkable

        System.out.println(cat);

    }

}
