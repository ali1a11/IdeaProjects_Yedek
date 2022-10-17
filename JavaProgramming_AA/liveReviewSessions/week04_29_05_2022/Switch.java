package week04_29_05_2022;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Floor number:? ");
        int floornumber = scanner.nextInt();

        String result = " ";

        switch (floornumber) {
            case 1:
                result = "the first floor";
                break;
            case 2:
                result = "the second floor";
                break;
            case 3:
                result = "the third floor";
                break;
            default:
                result = "wrong number";
                break;
        }

        System.out.println("result = " + result);

    }
}
