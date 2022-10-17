
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //
        int container1 = 0;
        int container2 = 0;
        //


        while (true) {
            //
            System.out.println("First: " + container1+"/100");
            System.out.println("Second: " + container2+"/100");
            //
            System.out.print("> ");

            String input = scan.nextLine();
            //


            //

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            //
            if (parts[0].equalsIgnoreCase("add")) {
                if (amount<0){
                    continue;
                }
                if (container1 + amount >= 100) {
                    container1 = 100;
                } else {
                    container1 += amount;
                }
                /*
                if (input.equals("add") && amount > 0) {
                first = first + amount;
                if (first > 100) {
                    first = 100;
                }
            }
                 */

            } else if (parts[0].equalsIgnoreCase("move")) {
                if (amount<0){
                    continue;
                }
                if (amount > container1) {
                    container2 += container1;
                    container1 = 0;
                } else if (container2 + amount >= 100) {
                    container2 = 100;
                    container1 -= amount;
                } else {
                    container1 -= amount;
                    container2 += amount;
                }
                /*
                if (input.equals("move") && amount > 0) {
                if (amount > first) {
                    amount = first;
                }

                first = first - amount;
                second = second + amount;

                if (second > 100) {
                    second = 100;
                }
            }
                 */



            } else if (parts[0].equalsIgnoreCase("remove")) {
                if (amount < container2) {
                    container2 -= amount;

                } else {
                    container2 = 0;
                }
                /*
                if (input.equals("remove") && amount > 0) {
                second = second - amount;
                if (second < 0) {
                    second = 0;
                }
            }
                 */

            }
        }
    }
}
