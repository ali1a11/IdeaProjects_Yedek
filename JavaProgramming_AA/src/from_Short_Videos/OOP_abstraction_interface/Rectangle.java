package from_Short_Videos.OOP_abstraction_interface;

public class Rectangle extends Shape {
    public double width, length;

    @Override
    public double area() {
        return width * length;
    }
}
