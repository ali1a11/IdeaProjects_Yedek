package deneme.Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class InputScannerLoop {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int size = scan1.nextInt();
        System.out.println(InputArray(size));

    }

     public static ArrayList<Integer> InputArray (int size){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < size; i++){
            System.out.print("Enter " + (i + 1) + ". number: ");
            list.add(scan.nextInt());
        }

        return list;
    }

}
