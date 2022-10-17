package day_39_Encapsulation_Inheritance_Recap.shapeTask;
/*
Shape:
	variables: name
	Encapsulate the field
	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}
 */

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name cannot be null");
            System.exit(1); // something went wrong
        }
        if(name.isEmpty()|| name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1); // something went wrong
        }
        this.name = name;
    }

    public double area (){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
