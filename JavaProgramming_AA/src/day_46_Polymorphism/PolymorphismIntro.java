package day_46_Polymorphism;

import day_43_Abstraction.employee.*;
import day_45_Abstraction_Cont.shape.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str = "Wooden spoon";

        Integer n1 = 2;

        Double d1 = 5.5;

        Boolean b1 = true;

        // to store different type of data in array we can use polymorphism

        Object[] array = {str, n1, d1, b1};

        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(Arrays.toString(array));


        System.out.println("----------------------------------");
        Tester tester = new Tester("Tom", 25, 'M', 25, "SDET", 100000);
        Developer developer = new Developer("Karen", 27, 'F', 32, "senior dev.", 125000);
        Teacher teacher = new Teacher("Janet", 32, 'F', 28, "English teacher", 99000);
        Driver driver = new Driver("Tim", 34, 'M', 20, "Truck driver", 89000);

        // with using polymorphism wee can generate list with different object types
        ArrayList<Employee> companyEmployees = new ArrayList<>();
        companyEmployees.add(teacher);
        companyEmployees.add(developer);
        companyEmployees.add(teacher);
        companyEmployees.add(driver);

        System.out.println(companyEmployees);

        System.out.println("--------------------");


        Shape shape = new Circle(5);
        shape.area();

        // instanceof

        boolean isSquare = shape instanceof Square; // false
        boolean isCircle = shape instanceof Circle; // true
        //boolean isRectangle = shape instanceof Rectangle;
        //boolean isTriangle = shape instanceof Triangle;



    }
}
