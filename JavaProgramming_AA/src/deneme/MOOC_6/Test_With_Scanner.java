package deneme.MOOC_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_With_Scanner {
    public static void main(String[] args) {
        String input = "one\n" + "two\n" + "three\n" + "four\n" + "five\n" + "one\n" + "six\n";

        Scanner scanner = new Scanner(input); //scanner gets input from input
        ArrayList<String> read = new ArrayList<>();

        while (true){
            System.out.println("Enter an input: ");
            String line = scanner.nextLine();



            if(read.contains(line)){
                break;
            }

            read.add(line);
            //System.out.println(read);
        }

        System.out.println("Thank you!");

        if(read.contains("six")){
            System.out.println("A value that shoul not have been added to the group was added to it");
        }

    }
}
