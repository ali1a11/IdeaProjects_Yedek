package day_10_Nested_if;

public class TernariesExample2 {
    public static void main(String[] args) {

        int age = 17;
        /*
        if (age >= 25) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }
         */
        String result = (age >= 25) ? "Eligible to buy alcohol" : "Not eligible to buy alcohol";
        System.out.println(result);
    }
}
