package day_39_Encapsulation_Inheritance_Recap.shapeTask;
/*
Rectangle extends Shape:
	variables: length, width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) { // name = "Rectangle" is known therefore no need to ask
        super("Rectangle"); // name = "Rectangle"
        setLength(length); // we use setter to check variable requirements
        setWidth(width); // we use setter to check variable requirements
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Invalid length" + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.err.println("Invalid width" + width);
            System.exit(1);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
