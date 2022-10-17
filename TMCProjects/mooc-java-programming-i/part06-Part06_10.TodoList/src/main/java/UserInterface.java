import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("stop")){
                break;
            }else if (command.equalsIgnoreCase("add")){
                System.out.print("To add: ");
                //String addWord = scanner.nextLine();
                list.add(scanner.nextLine());

            }else if (command.equalsIgnoreCase("list")) {
                list.print();
            } else if (command.equalsIgnoreCase("remove")) {
                System.out.println("Which one is removed? ");
                //int number = scanner.nextInt();
                list.remove(scanner.nextInt());
                scanner.nextLine();
            }

        }
    }


}

