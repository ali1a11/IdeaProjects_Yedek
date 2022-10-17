
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            System.out.print("> ");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);


            //

            if (command.equalsIgnoreCase("add")){
                if (amount<0){
                    continue;
                }
                if (amount + firstContainer>100){
                    firstContainer = 100;
                } else if (amount>0) {
                    firstContainer += amount;
                }
            }

            if (command.equalsIgnoreCase("move")){
                if (amount<0){
                    continue;
                }

                if (amount > firstContainer) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                } else if (secondContainer + amount >= 100) {
                    secondContainer = 100;
                    firstContainer -= amount;
                } else {
                    firstContainer -= amount;
                    secondContainer += amount;
                }
            }

            if (command.equalsIgnoreCase("remove")){
                if(amount<0){
                    continue;
                }

                if(amount<secondContainer){
                    secondContainer-=amount;
                } else {
                    secondContainer = 0;
                }
            }
        }
    }
}

/* from mooc
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);

            if (input.equals("add") && amount > 0) {
                first = first + amount;
                if (first > 100) {
                    first = 100;
                }
            }

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

            if (input.equals("remove") && amount > 0) {
                second = second - amount;
                if (second < 0) {
                    second = 0;
                }
            }

            System.out.println("");
        }
    }

}

 */
