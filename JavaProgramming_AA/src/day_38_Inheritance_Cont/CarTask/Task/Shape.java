package day_38_Inheritance_Cont.CarTask.Task;

public class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name ='" + name + '\'' +
                "area ='" + area() + '\'' +
                "perimeter ='" + perimeter() + '\'' +
                '}';
    }
}
