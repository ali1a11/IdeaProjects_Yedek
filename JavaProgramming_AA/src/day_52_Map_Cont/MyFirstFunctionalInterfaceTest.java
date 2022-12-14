package day_52_Map_Cont;

// lambda: () -> {};

public class MyFirstFunctionalInterfaceTest {
    public static void main(String[] args) {

        // function 1: create a function that can display a number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> { // if there is only one parameter you may not use paranthesis n -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even number.");
            } else {
                System.out.println(n + " is odd number.");
            }
        };

        oddOrEvenNumber.apply(20);

        // function 2: create a function that can check if a person is eligible to buy alcohol

        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (age) -> {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol.");
            } else {
                System.out.println("Not eligible to buy alcohol.");
            }
        };

        eligibleToBuyAlcohol.apply(18);

        // function 3: create a function that can display the cube of a number

        MyFirstFunctionalInterface printCube;
/*
        printCube = (n) -> {
            System.out.println(n * n * n);
        };
*/
        printCube = n -> System.out.println(n * n * n); // If there is only one statement in lambda expression's body you may not use {}

        printCube.apply(2);

        // function 4: crate a function that cn check if a number is evenly divisible by 3 & 5
        MyFirstFunctionalInterface divisibleBy3And5 = (n) -> {
            if(n % 15 == 0) {
                System.out.println(n + " is divisible by 3 and 5");
            } else {
                System.out.println(n + " is not divisible by 3 and 5");
            }
        };

        divisibleBy3And5.apply(30);

    }
}
