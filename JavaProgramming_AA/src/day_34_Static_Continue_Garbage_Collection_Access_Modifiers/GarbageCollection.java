package day_34_Static_Continue_Garbage_Collection_Access_Modifiers;


import day_30_Custom_Class.Dog;
import day_32_CustomClass_Constructor.Car;

import java.util.ArrayList;
import java.util.Locale;

public class GarbageCollection {
    public static void main(String[] args) {
/*
        // int num = null; // not possible // null can be assigned to only nonprimitiv variables

        String str1 = ""; // there is an object created.
        String str2 = null; //no object is created object is not exist // "" and null are not the same

        System.out.println(str2.toLowerCase()); //NullPointerException

 */
        String str = "Wooden spoon";
        str = null; // after this line "Wooden spoon" is eligible for garbage collection

        System.out.println(str); // null

        str = "edi";
        System.out.println(str); // edi

        Car car1 = new Car("Toyota");
        System.out.println("car1 = " + car1); // car1 = Car{make='Toyota', model='null', color='null', year=0, price=0}
        car1 = null;
        System.out.println("car1 = " + car1); // car1 = null

        // Second way unreferancing an object

        Dog dog1 = new Dog();
        dog1.name = "Lucy"; // first dog object has reference name dog1

        dog1 = new Dog(); // second dog
        dog1.name = "Max"; // previous dog object is eligible for garbage collection

        System.out.println(dog1);

        //----------------

        String language = "Python";
        language = "Java"; // "Python" object is eligible for garbage collection

        System.out.println("language = " + language); // language = Java // one referance name can be referans to only one object

        //multiple referance names can referans to same object.
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;

        list1.add(100);

        System.out.println("list1 = " + list1); // list1 = [100]
        System.out.println("list2 = " + list2); // list2 = [100]

        list2.add(200);

        System.out.println("list1 = " + list1); // list1 = [100, 200]
        System.out.println("list2 = " + list2); // list2 = [100, 200]

        // list1 and list2 referance same object

        System.out.println(list1 == list2); // true

    }
}
