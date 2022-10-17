package week03_22_05_2022;

public class Logical2 {
    public static void main(String[] args) {
        int b= 2;
        boolean res = ++b == 2 ||--b==2 &&--b==2;
        System.out.println("res = " + res);
        System.out.println("b = " + b);

        int c =1;
        boolean res2=++c ==2 &&--c==2;

        System.out.println("c = " + c);
    }
}
