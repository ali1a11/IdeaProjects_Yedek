package week24_07_2022.fieldTypes;
/*
Write the definition of a class Telephone.
The class has no constructors, one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92.
Create getNumber() and setNumber() methods that will manipulate with number instance variable.
 */

public class Telephone {
    public String number;
    public static int quantity;
    public static double total;

    static {
        quantity = 250;
        total = 1456.25;
    }


    // we can initialize static variables in constructor
    // when object is created static variables will be initialized
    /*
        public Telephone() {
        quantity = 250;
        total = 1456.25;
    }
     */

    //setter
    public void setNumber(String number) {
        this.number = number;
    }

    //getter
    public String getNumber() {
        return this.number;
    }

    public static void main(String[] args) {
        System.out.println("Before object Telephone.total = " + Telephone.total);
        Telephone telephone1 = new Telephone();

        System.out.println(telephone1.total);
        telephone1.setNumber("3586711122");

        System.out.println("telephone1.getNumber() = " + telephone1.getNumber());

        System.out.println("Telephone.total = " + Telephone.total);
    }
}
