package day_45_Abstraction_Cont.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    /*
        public Shape(){ // no need to take Shape name from user as an argument
        this.name = getClass().getSimpleName(); // we can get using this method
    }
     */

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return // getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'';
    }
}
