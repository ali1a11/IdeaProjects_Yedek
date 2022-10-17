package day_35_OOP_Encapsulation;
/*
	1. Create a class named Person:
		Variables: name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

		Add a constructor to initialize all the fields

		Add a static block to initialize all the statics

		Methods:
			printPlanetName()
			eat(String food)
			drink(String drink)
toString()
 */

public class Person {
    // instance variables can be used outside of the class with using object
    // Variables can be initialized here

    //instance member of class can be called through using object
    //static member of class can be called through using className or object of the class


    public String name;
    public int age;
    public char gender;
    public String language;

    // static variables
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    //Constructor
    public Person(String name, int age, char gender, String language) {
        this.name = name; // if paramater name(constructor parantezin icindekiler parameter) and instance variable name are same we have to use this
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;
    }

    public static void printPlanetName(){
        System.out.println("Planet name is " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
