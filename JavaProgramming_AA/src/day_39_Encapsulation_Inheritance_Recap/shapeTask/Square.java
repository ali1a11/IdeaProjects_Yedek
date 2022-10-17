package day_39_Encapsulation_Inheritance_Recap.shapeTask;
/*
Square extends Shape:
	variables: side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */

public class Square extends Shape {
    private double side;

    public Square(double side) { //String name, is not required since we know it is square
        super("Square"); // name yerine "Square"
        setSide(side); // to be able to side check variable requirements instead of this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("Invalid side; " + side);
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}
