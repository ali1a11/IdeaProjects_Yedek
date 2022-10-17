
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while(true){
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            System.out.print(">");

            String input = scan.nextLine();

            if (input.equalsIgnoreCase("quit")){
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if(command.equalsIgnoreCase("add")){
                firstContainer.add(amount);
            }

            if(command.equalsIgnoreCase("move")){
                secondContainer.add(Math.min(firstContainer.contains(), amount));
                firstContainer.remove(amount);
            }

            if(command.equalsIgnoreCase("remove")){
                secondContainer.remove(amount);
            }
        }


/*
        Container container = new Container();
        System.out.println(container);

        container.add(10);
        container.add(95);
        container.add(-5);
        System.out.println(container);

 */
/*
        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);

*/

        /*
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
         */
    }
}

