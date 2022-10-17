package day_31_Constructor;
/*
Create a custom class named Rectangle
Attributes: length, width

Add a constructor that can set all the fields

Actions: CalculateArea(): calculates the area of the rectangle, returns it as double
calculatePerimeter(): calculates the perimeter of the rectangle, returns it as double
toString(): displays the width, length, area and perimeter of the rectangle when an object ...
 */

public class Rectangle {
    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length* width;

    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}
