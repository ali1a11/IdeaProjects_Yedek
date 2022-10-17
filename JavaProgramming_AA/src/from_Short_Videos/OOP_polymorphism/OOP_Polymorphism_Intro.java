package from_Short_Videos.OOP_polymorphism;

// Ability of the objects to take many forms
// Occurs when reference type is parent class/interface and object type is child
// Only the methods/variables in reference type can be called
// When we call a method, it will call overridden version from a child class
// if method is not overridden, it will call parent/super class version
// Reference type can be parent class or interface
// Object type can be any extending or implementing child class
// Reference type decides what is accessible
// Object type decides which implementation of the method to be executed when the method is called

public class OOP_Polymorphism_Intro {
    public static void main(String[] args) {

        // polymorphism
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Square();

        System.out.println("shape1.area() = " + shape1.area());
        System.out.println("shape2.area() = " + shape2.area());
        System.out.println("shape3.area() = " + shape3.area());

        // no polymorphism
        Circle circle1 = new Circle();
        circle1.radius = 30;
        System.out.println("circle1.area() = " + circle1.area());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 4;
        rectangle1.length = 8;
        System.out.println("rectangle1.area() = " + rectangle1.area());

        Square square1 = new Square();
        square1.side = 5;
        System.out.println("square1.area() = " + square1.area());

        // without using polymorphism we cannot store different types of objects in a data collection
        Shape[] shapes = {circle1, rectangle1, square1, shape1, shape2, shape3};

        // Reference type is interface
        Volume obj1 = new Cube();
        Volume obj2 = new Cylinder();

        System.out.println("obj1.volume() = " + obj1.volume());
        System.out.println("obj2.volume() = " + obj2.volume());


    }
}
