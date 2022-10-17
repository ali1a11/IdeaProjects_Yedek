package deneme.Replit;

/*
Replit Search task test1 problem
*/


import java.util.ArrayList;
import java.util.Scanner;

public class ScannerinLoopPROBLEM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("How many input: ");
        int number = scanner.nextInt();
        scanner.nextLine();



        for (int i = 0; i < number; i++) {

            //System.out.print("Word: ");
            list.add(scanner.nextLine());
            System.out.println("list = " + list);
        }
    }
}
