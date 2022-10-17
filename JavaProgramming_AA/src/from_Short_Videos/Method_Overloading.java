package from_Short_Videos;

public class Method_Overloading {
    public static void main(String[] args) {

        int r1 = sum(1, 2);
        int r2 = sum(1, 2, 3);
        int r3 = sum(1, 2, 3, 4);

        double r4 = sum(1.5, 4);
        double r5 = sum(2.5, 5, 8, 7.2);

        System.out.println("r5 = " + r5);

    }

    public static int sum(int a, int b) {
        return (a + b);
    }

    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    public static int sum(int a, int b, int c, int d) {
        return sum(a, b, c) + d; //return (a + b + c + d);
    }

    public static double sum(double a, double b) {
        return (a + b);
    }

    public static double sum(double a, double b, double c) {
        return sum(a, b) + c; // return (a + b + c);
    }

    public static double sum(double a, double b, double c, double d) {
        return sum(a, b, c) + d; // return (a + b + c);
    }

}
