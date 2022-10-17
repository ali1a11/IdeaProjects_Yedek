package deneme.MOOC_10.recap.stream;
/*
Write a program that reads input from a user and prints statistics about those inputs.
When the user enters the string "end", the reading is stopped.
Other inputs are numbers in string format.
When you stop reading inputs, the program prints the number of positive integers divisible by three, and the average of all values.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            System.out.print("Number (Type 'end' to stop) : ");
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }
            inputs.add(row);
        }

        // counting the number of values divisible by three
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .filter(n -> n % 3 == 0)
                .count();

        double average = inputs.stream()
                .mapToInt(n->Integer.valueOf(n))
                .average()
                .getAsDouble();

        System.out.println("Divisible by three " + numbersDivisibleByThree);
        System.out.println("Average " + average);


    }
}
