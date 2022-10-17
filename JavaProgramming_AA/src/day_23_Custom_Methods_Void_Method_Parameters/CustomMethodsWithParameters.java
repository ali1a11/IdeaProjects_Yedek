package day_23_Custom_Methods_Void_Method_Parameters;

public class CustomMethodsWithParameters {
    // create a function that can check if a number is odd number or even number

    public static void oddOrEven(int number) {
        if (number == 0) {
            System.out.println(number + " is zero");
        } else if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    //create  a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2022 - birthYear;
        System.out.println("Your age is " + age);
    }

    //create a function that can print all the integer numbers between x and y

    public static void numbersBetween(int startingNumber, int endingNumber) {

        if(startingNumber>=endingNumber) {
            System.out.println("Starting number should be less than ending number");
        } else {
            for (int i = startingNumber +1; i < endingNumber ; i++) {
                System.out.println(i);
            }
        }


    }




    public static void main(String[] args) {
        oddOrEven(6);
        oddOrEven(0);
        oddOrEven(7);

        ageOfPerson(1975);

        numbersBetween(13, 16);
    }


}
