import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDoList = new ArrayList<>();

    public TodoList() {
    }

    public void add(String task){
        toDoList.add(task);
    }

    public void print(){
        for (int i = 0 ; i < toDoList.size(); i++) {
            System.out.println((i + 1) + ": " + toDoList.get(i));
        }
    }

    public void remove(int number){
        toDoList.remove(number-1);
    }
}

/*
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println((i + 1) + ": " + this.tasks.get(i));
        }
    }

    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index >= this.tasks.size()) {
            return;
        }

        this.tasks.remove(index);
    }
}
 */
