package from_Short_Videos.statics;

public class Circle {
    public double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double clacArea() {
        return radius * radius * pi;
    }

    public double calcPerimeter() {
        return 2 * radius * pi;
    }
    public static void printPI(){
        System.out.println(pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
