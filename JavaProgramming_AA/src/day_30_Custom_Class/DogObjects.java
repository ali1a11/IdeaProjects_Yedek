package day_30_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        // Creating an object

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1); // day_30_Custom_Class.Dog@49e4cb85 (toString() method olmadiginda)
        System.out.println(dog1); // Name :Lucy // according to toString() method

        System.out.println(dog1); // Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'} // according to toString() method

        // for custom class we need toString method


        // creating different Dog object
        Dog dog2 = new Dog();
        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White and  black";

        System.out.println(dog1);
        System.out.println(dog2);

        // defining characteristics of each object in this way not easy
        // We can use set method

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "Geman shepard", 2, 'M', "large", "black");

        System.out.println("dog3 = " + dog3);

        //------------------------
        dog1.eat();
        dog2.bark();

        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        dog4.setInfo("Kucu", "Kangal", 5, 'M', "big", "white");
        dog5.setInfo("Gogo", "Golden retriver", 3, 'F', "small", "dark golden");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

        int femaleDogsCount = 0;
        int maleDogsCount = 0;


        for (Dog each : dogs) {
            if (each.gender == 'F') {
                femaleDogs.add(each);
                femaleDogsCount++;
            } else {
                maleDogs.add(each);
                maleDogsCount++;
            }
        }

        System.out.println("femaleDogs = " + femaleDogs); // femaleDogs = [Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}, Dog{name='Gogo', breed='Golden retriver', age=3, gender=F, size='small', color='dark golden'}]

        System.out.println("maleDogs = " + maleDogs); // maleDogs = [Dog{name='Ace', breed='Husky', age=2, gender=M, size='Large', color='White and  black'}, Dog{name='Jack', breed='Geman shepard', age=2, gender=M, size='large', color='black'}, Dog{name='Kucu', breed='Kangal', age=5, gender=M, size='big', color='white'}]

        System.out.println("femaleDogsCount = " + femaleDogsCount);
        System.out.println("maleDogsCount = " + maleDogsCount);
    }
}
