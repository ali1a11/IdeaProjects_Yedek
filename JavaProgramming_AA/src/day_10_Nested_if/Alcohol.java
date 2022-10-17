package day_10_Nested_if;

public class Alcohol {
    public static void main(String[] args) {

        boolean hasID = true;
        int age = 25;

        if (hasID) {

            if (age >= 25) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        } else {
            System.out.println("Not has ID Not eligible to buy alcohol. You must have ID to buy alcohol");
        }

    }
}
