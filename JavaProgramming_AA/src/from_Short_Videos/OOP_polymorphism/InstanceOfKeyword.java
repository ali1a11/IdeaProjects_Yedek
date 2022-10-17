package from_Short_Videos.OOP_polymorphism;

public class InstanceOfKeyword {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Shape shape3 = new Square();
        Shape shape4 = new Cube();
        Shape shape5 = new Cylinder();

        if (shape1 instanceof Square) {
            System.out.println("It is a square");
        } else {
            System.out.println("It is not a square");
        }

        if (shape2 instanceof Rectangle) {
            System.out.println("It is a rectangle");
        } else {
            System.out.println("It is a rectangle");
        }


    }
}
