package day_47_Polymoprhism_Cont;


import day_43_Abstraction.employee.*;
import day_44_Abstraction_Cont.animalTask.*;
import day_45_Abstraction_Cont.shape.*;


public class ReferanceTypeCasting {
    public static void main(String[] args) {

        // Shape shape = (Shape) new Circle(4); // upcasting (done Implicitly)

        Shape shape = new Circle(4); // upcasting (done Implicitly)


        Dog dog2 = new Dog ("Max", "Husky", 'M', 3, "Small", "White");
        Dog dog3 = dog2;

        System.out.println("dog2 = " + dog2);
        System.out.println("dog3 = " + dog3);

        Animal animal = new Dog ("Max", "Husky", 'M', 3, "Small", "White");

        // animal.bark() // cannot call directly
        // Dog dog = animal; // cannot

        Dog dog =(Dog)animal; // downcasting

        // One Dog object was created and it has two referace names (animal and dog)

        System.out.println("animal.getName() = " + animal.getName());
        System.out.println("dog.getName() = " + dog.getName());

        dog.bark();
        // animal.bark() // cannot call directly
        // if you want to use bark() method one time and do not need other Dog class members no need dog variable
        // we can use downcasting
        ((Dog) animal).bark(); // downcasting

        //
        Shape shape1 = new Square(5);
        System.out.println(((Square) shape1).getSide()); // downcasting

        System.out.println("---------------------------");

        Animal animal2 = new Cat("Jim", "Scottish", 'M', 3, "Small", "White");

        Cat cat = (Cat) animal2; // if you want to access and use Cat class members more than one time
        cat.meow();

        ((Cat) animal2).meow(); // downcasting // if you want to use the Meow method one time

        // ((Dog) animal2).bark(); // ClassCastException

        System.out.println("---------------------------");

        Employee employee = new Tester("John", 30, 'M', 42, "SDET", 100000);

        ((Tester) employee).bugReport();

        // ((Tester) employee).unitTest(); // java: cannot find s

        // ((Developer) employee).unitTest(); // ClassCastException

        // Driver driver = (Driver) employee; // ClassCastException

        Person person = employee;

        // Teacher teacher = (Teacher) employee;// ClassCastException

        System.out.println("---------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        // ((Cube)s1).volume(); // ReferanceTypeCasting (No IS A RELATIONSHIP BETWEEN Cube and Circle classes


    }
}
