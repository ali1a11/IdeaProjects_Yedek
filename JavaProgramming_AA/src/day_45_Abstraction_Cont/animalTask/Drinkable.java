package day_45_Abstraction_Cont.animalTask;

public interface Drinkable {
    static int a=100;
    int b = 20;

    public default void drink2(){ // default method. Subclasses can inherit Interface with default method having implementation
        // subclasses have the same implementation of the method
        // default method can be called with instance (object)
        // treated like instance method
        System.out.println(" dirinking water. (default method from Drinkable Interface");
    }

    public static void method9(){ // we can use static variable in the static method in Interface
        // it can be called with Interface name
        // one copy
        System.out.println(a + b);
        System.out.println("Static method from Drinkable Interface");
    }
}
