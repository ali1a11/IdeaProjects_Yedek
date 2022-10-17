package week03_22_05_2022;

public class OperatorsExamples {
    public static void main(String[] args) {
        //assignment operator
        
        int x = 10;
        x+=2;
        System.out.println("x = " + x);
        
        x-=2;
        System.out.println("x = " + x);
        
        x*=2;
        System.out.println("x = " + x);

        x/=2;
        System.out.println("x = " + x);
        
        x%=2;
        System.out.println("x = " + x);

        //Relational operators
        int num1 = 10;
        int num2 = 5;
        boolean b =num1>num2;
        System.out.println("b = " + b);
    }
}
