
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birdList = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            } else if (input.equalsIgnoreCase("add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in Latin: ");
                String nameInLatin = scan.nextLine();

                birdList.add(new Bird(name, nameInLatin));

            } else if (input.equalsIgnoreCase("all")) {
                for (Bird bird : birdList) {
                    System.out.println(bird);
                }

            } else if (input.equalsIgnoreCase("one")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                int count = 0;
                for (Bird bird : birdList) {
                    if (bird.getName().equalsIgnoreCase(birdName)) {
                        System.out.println(bird);
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("Not a bird!");
                }

            } else if (input.equalsIgnoreCase("observation")) {
                System.out.print("Bird? ");
                String birdName = scan.nextLine();
                int count = 0;
                for (Bird bird : birdList) {
                    if (bird.getName().equalsIgnoreCase(birdName)) {
                        count++;
                        bird.observationCount();
                    }
                }
                if (count == 0) {
                    System.out.println("Not a bird!");
                }

            } else {
                System.out.println("Invalid command!!!");
            }
        }
    }

}

/* from mooc
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        BirdDatabase birdbase = new BirdDatabase();

        UserInterface ui = new UserInterface(scan, birdbase);
        ui.start();
    }

}

 */