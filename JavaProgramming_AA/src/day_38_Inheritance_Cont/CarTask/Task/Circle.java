package day_38_Inheritance_Cont.CarTask.Task;

import utilities.MathUtility;

public class Circle extends Shape{
    public static double pi = Math.PI;
    public double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public double area() {

        return pi*r*r;
    }

    @Override
    public double perimeter() {
        return 2*pi*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name ='" + name + '\'' +
                "r=" + r +
                "pi=" + pi +
                "area ='" + area() + '\'' +
                "perimeter ='" + perimeter() + '\'' +
                '}';
    }
}
