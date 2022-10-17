package day_38_Inheritance_Cont.CarTask.Task;

public class Rectangle extends Shape {
    public int l;
    public int w;

    public Rectangle(String name, int l, int w) {
        super(name);
        this.l = l;
        this.w = w;
    }

    @Override
    public double area() {
        return l * w;
    }

    @Override
    public double perimeter() {
        return 2 * (l + w);
    }

    @Override
    public String toString() {
        return "Square{" +
                "name ='" + name + '\'' +
                "l=" + l +
                "w=" + w +
                "area ='" + area() + '\'' +
                "perimeter ='" + perimeter() + '\'' +
                '}';
    }
}
