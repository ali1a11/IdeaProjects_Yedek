package week04_29_05_2022;

import java.util.Scanner;

public class BranchedIf {
    public static void main(String[] args) {

        int floorNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Floor number:? ");
        floorNumber = scanner.nextInt();

        if (floorNumber == 1){
            System.out.println("You are living at the first floor.");
        }else if (floorNumber==2){
            System.out.println("You are living at the second floor.");
        }else if (floorNumber==3){
            System.out.println("You are living at the third floor.");
        }else {
            System.err.println("Wrong floor number");
        }
        scanner.close();

    }
}
