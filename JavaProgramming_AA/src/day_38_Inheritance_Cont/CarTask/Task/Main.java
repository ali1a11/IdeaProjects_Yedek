package day_38_Inheritance_Cont.CarTask.Task;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("C1", 3);
        Square s1 = new Square("S1", 5);


        System.out.println(c1);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());

        System.out.println(s1);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());




    }
}

