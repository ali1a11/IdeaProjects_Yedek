package from_Short_Videos.OOP_polymorphism;

public class Circle extends Shape {
    public double radius;
    public static double pi = 3.14;


    @Override
    public double area() {
        return radius * radius * pi;
    }
}
