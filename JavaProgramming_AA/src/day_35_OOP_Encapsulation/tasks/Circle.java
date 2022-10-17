package day_35_OOP_Encapsulation.tasks;
/*
2. Create a class named Circle

private variable: radius
public variable: pi

Encapsulate all the private fields

1. radius of the circle can not be zero or negative

Add a constructor that can set the raidus of coircle when circle object is created

Methods:
 		calcArea()
 		calcPerimeter()
 		toString()
 */

public class Circle {
    private double radius;
    public static double pi;

    static {
        pi = 3.14;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            return;
        }
        this.radius = radius;
    }

    public double calcArea() {

        return pi * radius * radius;
        //return pi*getRadius()*getRadius();
    }

    public double calcPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "perimeter=" + calcPerimeter() +
                "area=" + calcArea() +
                '}';


    }
}
