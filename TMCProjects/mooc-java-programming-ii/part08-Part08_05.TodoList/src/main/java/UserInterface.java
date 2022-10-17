import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("stop")){
                break;
            }

            if(command.equalsIgnoreCase("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }

            if(command.equalsIgnoreCase("list")){
                todoList.print();
            }

            if(command.equalsIgnoreCase("remove")){
                System.out.print("Which one is removed? ");
                int removeNumber = Integer.valueOf(scanner.nextLine());
                todoList.remove(removeNumber);
            }
        }
    }
}

/*
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                String toAdd = scanner.nextLine();
                this.todoList.add(toAdd);
            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                int toRemove = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(toRemove);
            }
        }
    }
}
 */
