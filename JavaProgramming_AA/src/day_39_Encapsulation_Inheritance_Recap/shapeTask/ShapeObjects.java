package day_39_Encapsulation_Inheritance_Recap.shapeTask;



public class ShapeObjects {
    public static void main(String[] args) {

        Circle c1 = new Circle(3);
        Rectangle r1 = new Rectangle(2, 4);
        Square s1 = new Square(7);

        System.out.println(c1);

        System.out.println(r1);

        System.out.println(s1);

        s1.setSide(10);
        System.out.println("s1.area() = " + s1.area());


    }
}
