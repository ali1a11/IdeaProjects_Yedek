package day_10_Nested_if;

public class TernariesIntro {
    public static void main(String[] args) {
        int n = 100;
        /*
        if (n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
        */
        String result1 = (n%2 == 0)? "Even": "Odd";
        System.out.println(result1);
    }
}
