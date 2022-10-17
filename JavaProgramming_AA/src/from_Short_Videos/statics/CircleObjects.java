package from_Short_Videos.statics;

public class CircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(4);


        System.out.println(circle1);
        System.out.println("Circle.pi = " + Circle.pi);
        Circle.printPI(); // we can reach static method using class name
        circle1.printPI(); // we can reach static method using object

        System.out.println("circle1.pi = " + circle1.pi); // circle1.pi = 3.14
        System.out.println("circle2.pi = " + circle2.pi); // circle2.pi = 3.14

    }
}
