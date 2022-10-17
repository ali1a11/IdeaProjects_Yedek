package day_38_Inheritance_Cont.CarTask.Task;

public class Square extends Shape{
    public int s;

    public Square(String name, int s) {
        super(name);
        this.s =s;
    }

    @Override
    public double area() {
        return s*s;
    }

    @Override
    public double perimeter() {
        return 4*s;
    }
    @Override
    public String toString() {
        return "Square{" +
                "name ='" + name + '\'' +
                "s=" + s +
                "area ='" + area() + '\'' +
                "perimeter ='" + perimeter() + '\'' +
                '}';
    }
}
