package day_39_Encapsulation_Inheritance_Recap.shapeTask;
/*
Circle extends Shape:
		variables: radius, pi (static)

		Encapsulate the field

		Add a constructor to set the filed

		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter
 */

public class Circle extends Shape {
    private double radius;
    public static double pi = 3.14;

    public Circle(double radius) { // name = "Circle" is known therefore no need to ask
        super("Circle"); // name = "Circle"
        setRedius(radius); // we use setter to check variable requirements

    }

    public double getRadius() {
        return radius;
    }

    public void setRedius(double radius) {
        if (radius <= 0) {
            System.err.println("Invalid radius: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "pi=" + pi +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}
