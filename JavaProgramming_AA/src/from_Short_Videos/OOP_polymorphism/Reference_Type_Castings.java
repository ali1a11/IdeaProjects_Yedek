package from_Short_Videos.OOP_polymorphism;

// There must be IS A (inheritance) relationship between the object type and reference type we are casting it to,
// otherwise ClassCastException will be thrown
// upcasting and downcasting

public class Reference_Type_Castings {
    public static void main(String[] args) {

       // upcasting

        Shape shape1 = new Square(); // upcasting (done implicitly)  // Shape shape1 = (Shape) new Square();

        // downcasting

        Shape shape2 = new Cube();

        System.out.println("shape2.area() = " + shape2.area());

        ((Cube) shape2).volume(); // downcasting (done explicitly) be careful (Cube) shape2) !!!

        System.out.println("((Cube) shape2).volume() = " + ((Cube) shape2).volume());
    }
}
