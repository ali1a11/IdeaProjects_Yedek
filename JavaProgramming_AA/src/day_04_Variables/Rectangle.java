package day_04_Variables;
/*
	2. Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
						length
						width

						area = length * width
						perimeter =  2 * (length + width)
 */

public class Rectangle {
    public static void main(String[] args) {

        double lenght = 2.3;
        double width = 3.8;

        double area = lenght * width;
        double perimeter = 2 * (lenght + width);

        System.out.println("lenght = " + lenght);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
