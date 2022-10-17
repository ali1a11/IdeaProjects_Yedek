package day_40_Protected_Access_Modifier_Final;

public final class Dog extends Animal{ // final class cannot be inherited by other classes

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat(){
        System.out.println(getName() + " is eating dog food.");
    }

    /*
    public void drink(){ //final method cannot be overridden
        System.out.println(getName() + " is drinking.");
    }
    */
    // final classes cannot be inherited. cannot have child(sub) classes.

    public void bark(){
        System.out.println(getName() + " is barking.");
    }


}
