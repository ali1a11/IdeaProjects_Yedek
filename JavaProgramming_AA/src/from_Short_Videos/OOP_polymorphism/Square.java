package from_Short_Videos.OOP_polymorphism;

public class Square extends Shape {
    public double side;


    @Override
    public double area() {
        return side * side;
    }
}
